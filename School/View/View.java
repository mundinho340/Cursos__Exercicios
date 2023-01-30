package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.*;
import java.sql.*;

import javax.swing.*;

import Controlador.ControllerEstudante;
import Entidade.Estudante;



public class View extends JFrame implements ActionListener,MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	JRadioButton rdbtnFemenino ;
	private JTextField txtNome;
	JRadioButton rdbtnMasculino;
	private JTextField textSobrenome, textEndereco;
	private JTextField textTelefone;
	String sexo;
	private JTable listagem;
	JButton btnAdicionar, btnListar, btnActualizar,  btnRemover;
	//private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public View() {
		setTitle("GESTAO DO ESTUDANTE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 995, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Dados do Estudante", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(29, 11, 442, 360);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(336, 14, 46, 14);
		panel.add(lblCodigo);
		
		JLabel Nome = new JLabel("Nome");
		Nome.setBounds(22, 19, 58, 28);
		panel.add(Nome);
		
		JLabel lblTeste = new JLabel("Sobrenome");
		lblTeste.setBounds(22, 73, 58, 14);
		panel.add(lblTeste);
		
		JLabel lblTeste_1 = new JLabel("Telefone");
		lblTeste_1.setBounds(22, 117, 46, 14);
		panel.add(lblTeste_1);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(392, 11, 40, 20);
		panel.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(90, 23, 232, 20);
		panel.add(txtNome);
		
		textSobrenome = new JTextField();
		textSobrenome.setColumns(10);
		textSobrenome.setBounds(90, 70, 232, 20);
		panel.add(textSobrenome);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(90, 114, 232, 20);
		panel.add(textTelefone);
		
		btnRemover = new JButton("Remover");
		btnRemover.setBounds(10, 276, 85, 33);
		panel.add(btnRemover);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(105, 276, 85, 33);
		panel.add(btnActualizar);
		
		btnListar = new JButton("Listar");
		btnListar.setBounds(200, 276, 85, 33);
		panel.add(btnListar);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(331, 276, 101, 33);
		panel.add(btnAdicionar);
		
		JLabel lblEndereco = new JLabel("Endereco");
		lblEndereco.setBounds(22, 156, 46, 14);
		panel.add(lblEndereco);
		
		textEndereco = new JTextField();
		textEndereco.setBounds(90, 153, 232, 20);
		panel.add(textEndereco);
		textEndereco.setColumns(10);
		
		rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(81, 194, 109, 23);
		panel.add(rdbtnMasculino);
		rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setBounds(221, 194, 109, 23);
		panel.add(rdbtnFemenino);
		btnAdicionar.addActionListener(this);
		btnListar.addActionListener(this);
		btnActualizar.addActionListener(this);
		btnRemover.addActionListener(this);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(534, 11, 435, 404);
		contentPane.add(scrollPane);
		
		listagem = new JTable();
		listagem.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo", "Nome", "Sobrenome", "Telefone", "Endereço", "Sexo"
			}
		));
		scrollPane.setViewportView(listagem);
		
		JPanel panel_2 = new JPanel();
		scrollPane.setColumnHeaderView(panel_2);
		panel_2.setBorder(new TitledBorder(null, "Listagem", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setLayout(null);
		listagem.addMouseListener(this);
	}
	
	public void limparCaixas(){
		txtCodigo.setText("");
		txtNome.setText("");
		textSobrenome.setText("");
		textTelefone.setText("");
		
	}
	
	public void limparTabela(){
		while(listagem.getRowCount()>0){
			((DefaultTableModel) listagem.getModel()).removeRow(0);
		}
	}
	public void listarEstudante(){
		limparTabela();
		DefaultTableModel listar=(DefaultTableModel) listagem.getModel();
		try {
			ArrayList<Estudante> estudantes=ControllerEstudante.listaDeEstudantes();
			for(Estudante estudante: estudantes){
				listar.addRow(new Object[]{
						estudante.getCodigo(),
						estudante.getNome(),
						estudante.getSobrenome(),
						estudante.getTelefone(),
						estudante.getEndereco(),
						estudante.getSexo(),
				
						
				});
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnAdicionar){
			//int codigo=Integer.parseInt(txtCodigo.getText());
			String nome=txtNome.getText();
			String sobrenome =textSobrenome.getText();
			String telefone = textTelefone.getText();
			String endereco = textEndereco.getText();
			System.out.println("yha");
			if(rdbtnFemenino.isSelected()==true){
				sexo="Femenino";
			}
			else{
				sexo="masculino";
			}
			
			try {
				ControllerEstudante.adicionarEstudante(nome, sobrenome, telefone, endereco, sexo);
				JOptionPane.showMessageDialog(null, "adicionado com sucesso");
				limparCaixas();
			} catch (SQLException e1) {
				JOptionPane.showMessageDialog(null, e1.toString());
				
			}
			
		}
		
		if(e.getSource()==btnListar){
			listarEstudante();
		}
		if(e.getSource()==btnActualizar){
			int codigo=Integer.parseInt(txtCodigo.getText());
			String nome=txtNome.getText();
			String sobrenome = textSobrenome.getText();
			String telefone = textTelefone.getText();
			String endereco= textEndereco.getText();
			
			try {
				ControllerEstudante.actualizar(codigo, nome, sobrenome, telefone, endereco, sexo);
				JOptionPane.showMessageDialog(null, "atualizado com sucesso");
				limparCaixas();
				limparTabela();
				listarEstudante();
			} catch (SQLException e1) {
				JOptionPane.showMessageDialog(null, e1.toString()+" Atualizar" );
			}
		}
		if(e.getSource()==btnRemover){
			//int codigo=Integer.parseInt(txtCodigo.getText());
			String nome=txtNome.getText();
			try {
				ControllerEstudante.apagar(nome);
				JOptionPane.showMessageDialog(null, "remmovido com sucesso");
				limparCaixas();
				limparTabela();
				listarEstudante();
			} catch (SQLException e1) {
				JOptionPane.showMessageDialog(null, e1.toString() +" -> remover");
			}
		}
		
	}

	
	public void mouseClicked(MouseEvent e) {
		if(listagem.getSelectedRow()!=-1){
			int indice= listagem.getSelectedRow();
			TableModel modelo= listagem.getModel();
			txtCodigo.setText(modelo.getValueAt(indice, 0).toString());
			txtNome.setText(modelo.getValueAt(indice, 1).toString());
			textSobrenome.setText(modelo.getValueAt(indice, 2).toString());
			textTelefone.setText(modelo.getValueAt(indice, 3).toString());
			
		}
		
	}

	
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
