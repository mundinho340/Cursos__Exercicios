package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Controladores.ControllerEstudante;
import Entidade.Estudante;

import javax.swing.JButton;

import baseDados.Conexao;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;

public class Home extends JFrame implements ActionListener,MouseListener {
	private JPanel contentPane;
	private static JTable listagem;
	zye panel =new zye();
	private static JTextField textNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					listarEstudante();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1025, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSistemaDeGesto = new JLabel("Sistema de Gest\u00E3o de Estudante");
		lblSistemaDeGesto.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSistemaDeGesto.setBounds(211, 11, 269, 31);
		contentPane.add(lblSistemaDeGesto);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparTabela();
				listarEstudante();
				
				System.out.println("ola");
			}
		});
		btnListar.setBounds(609, 110, 136, 31);
		contentPane.add(btnListar);
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Listagem", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 99, 531, 288);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 23, 498, 254);
		panel_2.add(scrollPane);
		
		listagem = new JTable();
		listagem.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo", "Nome", "sobrenome", "telefone", "Endereço","sexo"
			}
		));
		scrollPane.setViewportView(listagem);
		listagem.addMouseListener(this);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Estudante atulizado com sucesso.");

			}
		});
		btnAtualizar.setBounds(609, 258, 136, 31);
		contentPane.add(btnAtualizar);
		
		JButton btnApagae = new JButton("Apagar");
		btnApagae.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome;
				nome=textNome.getText();
				try {
					limparTabela();
					apagar(nome);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnApagae.setBounds(609, 346, 136, 31);
		contentPane.add(btnApagae);
		
		textNome = new JTextField();
		textNome.setBounds(200, 64, 192, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JButton btnNovoEstudante = new JButton("Novo Estudante");
		btnNovoEstudante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zye add = new zye();
				add.setVisible(true);
				
			}
		});
		btnNovoEstudante.setBounds(609, 188, 136, 31);
		contentPane.add(btnNovoEstudante);
		
		JLabel lblPesquisarNome = new JLabel("Pesquisar Nome");
		lblPesquisarNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPesquisarNome.setBounds(27, 62, 136, 24);
		contentPane.add(lblPesquisarNome);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchEstudante();
			}
		});
		btnPesquisar.setBounds(440, 62, 101, 24);
		contentPane.add(btnPesquisar);
		//listagem.addMouseListener(this);
	

	}
	
	public static void apagar(String nome) throws SQLException{
		
		try {
			
			ControllerEstudante.apagar(nome);
			JOptionPane.showMessageDialog(null, "remmovido com sucesso");
			listarEstudante();
		} catch (SQLException e1) {
			JOptionPane.showMessageDialog(null, e1.toString());
		}
	}
	public void limparTabela(){
		while(listagem.getRowCount()>0){
			((DefaultTableModel) listagem.getModel()).removeRow(0);
		}
	}
	
	public static void listarEstudante(){
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
						estudante.getSexo()
						
				});
			}
		} catch (SQLException e) {
			System.out.println("Erro listar estudante");
			JOptionPane.showMessageDialog(null, e.toString());
			e.printStackTrace();
		}
	}
	public static void searchEstudante(){
		DefaultTableModel listar=(DefaultTableModel) listagem.getModel();
		try {
			ArrayList<Estudante> estudantes=ControllerEstudante.FoundEstudante();
			for(Estudante estudante: estudantes){
				listar.addRow(new Object[]{
						estudante.getCodigo(), 
						estudante.getNome(),
						estudante.getSobrenome(),
						estudante.getTelefone(),
						estudante.getEndereco(),
						estudante.getSexo()
						
				});
			}
		} catch (SQLException e) {
			System.out.println("Erro listar estudante");
			JOptionPane.showMessageDialog(null, "Erro ao procurar estudante "+e.toString());
			e.printStackTrace();
		}
	}
	
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void mouseClicked(MouseEvent e) {
		if(listagem.getSelectedRow()!=-1){
			int indice= listagem.getSelectedRow();
			TableModel modelo= listagem.getModel();
			panel.getTextNome();
			panel.getTextSobrenome();
			panel.getTextTelefone();
			panel.getTextEndereco();
			
		
			
		}
		
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



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
