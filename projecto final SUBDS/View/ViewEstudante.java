package View;

//package Entidade;
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

import Controladores.ControllerEstudante;
import Entidade.GestaoDeEstudante;


public class ViewEstudante extends JFrame implements ActionListener,MouseListener {
	public ViewEstudante() {
	}

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtTelefone;
	private JTextField txtSexo;
	private JTable listagem;
	JButton btnAdicionar, btnListar, btnActualizar,  btnRemover;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestaoDeEstudante frame = new GestaoDeEstudante();
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
	public GestaoDeEstudante() {
		setTitle("GESTAO DO ESTUDANTE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Dados do Estudante", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 0, 300, 152);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(22, 21, 46, 14);
		panel.add(lblCodigo);
		
		JLabel Nome = new JLabel("Nome");
		Nome.setBounds(22, 46, 46, 14);
		panel.add(Nome);
		
		JLabel lblTeste = new JLabel("sobrenome");
		lblTeste.setBounds(22, 71, 70, 14);
		panel.add(lblTeste);
		
		JLabel lblTeste_1 = new JLabel("telefone");
		lblTeste_1.setBounds(22, 96, 46, 14);
		panel.add(lblTeste_1);
		
		JLabel lblTeste_y= new JLabel("sexo");
		lblTeste_y.setBounds(22, 120, 86, 14);
		panel.add(lblTeste_y);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(78, 18, 86, 20);
		panel.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(78, 43, 184, 20);
		panel.add(txtNome);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setColumns(10);
		txtSobrenome.setBounds(78, 68, 86, 20);
		panel.add(txtSobrenome);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(78, 93, 86, 20);
		panel.add(txtTelefone);
		
		txtSexo = new JTextField();
		txtSexo.setColumns(10);
		txtSexo.setBounds(78, 120, 86, 20);
		panel.add(txtSexo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Operacoes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(313, 0, 111, 154);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(10, 11, 89, 23);
		panel_1.add(btnAdicionar);
		btnAdicionar.addActionListener(this);
		
		btnListar = new JButton("Listar");
		btnListar.setBounds(10, 39, 89, 23);
		panel_1.add(btnListar);
		btnListar.addActionListener(this);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(10, 72, 89, 23);
		panel_1.add(btnActualizar);
		btnActualizar.addActionListener(this);
		
		btnRemover = new JButton("Remover");
		btnRemover.setBounds(10, 103, 89, 23);
		panel_1.add(btnRemover);
		btnRemover.addActionListener(this);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Listagem", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(31, 151, 393, 130);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 373, 108);
		panel_2.add(scrollPane);
		
		listagem = new JTable();
		listagem.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo", "Nome", "sobrenome", "telefone", "sexo"
			}
		));
		scrollPane.setViewportView(listagem);
		listagem.addMouseListener(this);
	}
	
	public void limparCaixas(){
		txtCodigo.setText("");
		txtNome.setText("");
		txtSobrenome.setText("");
		txtTelefone.setText("");
		txtSexo.setText("");
		//txtTestey.setText
		
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
						estudante.getSexo(),
						//estudante.verificarSituacao(estudante.calculaMedia())
						
				});
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnAdicionar){
			int codigo=Integer.parseInt(txtCodigo.getText());
			String nome=txtNome.getText();
			String sobrenome=txtSobrenome.getText();
			String telefone=txtTelefone.getText();
			String sexo = txtSexo.getText();
			
			
			try {
				ControllerEstudante.adicionarEstudante(codigo, nome, sobrenome, telefone, sexo);
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
			String sobrenome=txtSobrenome.getText();
			String telefone=txtTelefone.getText();
			String sexo = txtSexo.getText();
			
			
			
			try {
				ControllerEstudante.actualizar(codigo, nome, sobrenome,telefone, sexo );
				JOptionPane.showMessageDialog(null, "atualizado com sucesso");
				limparCaixas();
				limparTabela();
				listarEstudante();
			} catch (SQLException e1) {
				JOptionPane.showMessageDialog(null, e1.toString());
			}
		}
		if(e.getSource()==btnRemover){
			int codigo=Integer.parseInt(txtCodigo.getText());
			try {
				ControllerEstudante.apagar(codigo);
				JOptionPane.showMessageDialog(null, "remmovido com sucesso");
				limparCaixas();
				limparTabela();
				listarEstudante();
			} catch (SQLException e1) {
				JOptionPane.showMessageDialog(null, e1.toString());
			}
		}
		
	}

	
	public void mouseClicked(MouseEvent e) {
		if(listagem.getSelectedRow()!=-1){
			int indice= listagem.getSelectedRow();
			TableModel modelo= listagem.getModel();
			txtCodigo.setText(modelo.getValueAt(indice, 0).toString());
			txtNome.setText(modelo.getValueAt(indice, 1).toString());
			txtSobrenome.setText(modelo.getValueAt(indice, 2).toString());
			txtTelefone.setText(modelo.getValueAt(indice, 3).toString());
			txtSexo.setText(modelo.getValueAt(indice, 4).toString());
			
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
