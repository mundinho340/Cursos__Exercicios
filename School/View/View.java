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

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNome;
	private JTextField txtTeste1;
	private JTextField txtTeste2;
	private JTable listagem;
	JButton btnAdicionar, btnListar, btnActualizar,  btnRemover;

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
		panel.setBounds(31, 0, 496, 203);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(22, 21, 46, 14);
		panel.add(lblCodigo);
		
		JLabel Nome = new JLabel("Nome");
		Nome.setBounds(22, 46, 46, 14);
		panel.add(Nome);
		
		JLabel lblTeste = new JLabel("Teste 1");
		lblTeste.setBounds(22, 71, 46, 14);
		panel.add(lblTeste);
		
		JLabel lblTeste_1 = new JLabel("Teste 2");
		lblTeste_1.setBounds(22, 131, 46, 14);
		panel.add(lblTeste_1);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(78, 18, 86, 20);
		panel.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(78, 43, 184, 20);
		panel.add(txtNome);
		
		txtTeste1 = new JTextField();
		txtTeste1.setColumns(10);
		txtTeste1.setBounds(78, 68, 86, 20);
		panel.add(txtTeste1);
		
		txtTeste2 = new JTextField();
		txtTeste2.setColumns(10);
		txtTeste2.setBounds(78, 128, 165, 17);
		panel.add(txtTeste2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Operacoes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(537, 0, 289, 378);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(10, 23, 176, 33);
		panel_1.add(btnAdicionar);
		btnAdicionar.addActionListener(this);
		
		btnListar = new JButton("Listar");
		btnListar.setBounds(10, 89, 176, 33);
		panel_1.add(btnListar);
		btnListar.addActionListener(this);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(10, 159, 176, 33);
		panel_1.add(btnActualizar);
		btnActualizar.addActionListener(this);
		
		btnRemover = new JButton("Remover");
		btnRemover.setBounds(10, 220, 176, 33);
		panel_1.add(btnRemover);
		btnRemover.addActionListener(this);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 203, 496, 175);
		contentPane.add(scrollPane);
		
		listagem = new JTable();
		listagem.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo", "Nome", "Teste 1", "Teste 2", "Media", "Situacao"
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
		txtTeste1.setText("");
		txtTeste2.setText("");
		
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
						estudante.getNota1(),
						estudante.getNota2(),
						estudante.calculaMedia(),
						estudante.verificarSituacao(estudante.calculaMedia())
						
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
			double teste1=Double.parseDouble(txtTeste1.getText());
			double teste2=Double.parseDouble(txtTeste2.getText());
			
			try {
				ControllerEstudante.adicionarEstudante(codigo, nome, teste1, teste2);
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
			double teste1=Double.parseDouble(txtTeste1.getText());
			double teste2=Double.parseDouble(txtTeste2.getText());
			
			try {
				ControllerEstudante.actualizar(codigo, nome, teste1, teste2);
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
			txtTeste1.setText(modelo.getValueAt(indice, 2).toString());
			txtTeste2.setText(modelo.getValueAt(indice, 3).toString());
			
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
