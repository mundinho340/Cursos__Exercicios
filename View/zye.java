package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JButton;

import Controladores.ControllerEstudante;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

public class zye extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textSobrenome;
	private JTextField textTelefone;
	private JTextField textEndereco;
	JButton btnAdicionar, btnListar, btnActualizar,  btnRemover;
	ControllerEstudante controlerEstudante = new ControllerEstudante();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					zye frame = new zye();
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
	public zye() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSistemaDeGesto = new JLabel("Sistema de Gest\u00E3o de Estudante");
		lblSistemaDeGesto.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSistemaDeGesto.setBounds(211, 11, 269, 31);
		contentPane.add(lblSistemaDeGesto);
		
		JLabel lblNome = new JLabel("Nome ");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(66, 76, 46, 14);
		contentPane.add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(194, 75, 317, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSobrenome.setBounds(66, 121, 72, 14);
		contentPane.add(lblSobrenome);
		
		textSobrenome = new JTextField();
		textSobrenome.setBounds(196, 120, 315, 20);
		contentPane.add(textSobrenome);
		textSobrenome.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefone.setBounds(66, 168, 84, 14);
		contentPane.add(lblTelefone);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(196, 167, 315, 20);
		contentPane.add(textTelefone);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSexo.setBounds(66, 266, 46, 14);
		contentPane.add(lblSexo);
		
		JCheckBox chckbxMas = new JCheckBox("Masculino");
		chckbxMas.setBounds(194, 264, 97, 23);
		contentPane.add(chckbxMas);
		
		JCheckBox chckbxFemenino = new JCheckBox("Femenino");
		chckbxFemenino.setBounds(414, 264, 97, 23);
		contentPane.add(chckbxFemenino);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome=textNome.getText();
				int codigo=0;
				String sobrenome=textSobrenome.getText();
				String telefone=textTelefone.getText();
				String sexo = "null";
				try {
					ControllerEstudante.adicionarEstudante(codigo, nome, sobrenome, telefone, sexo);
					JOptionPane.showMessageDialog(null, "Usuario adicionado com sucesso");
					limparCampos();
				} catch (SQLException e2) {
					JOptionPane.showMessageDialog(null, e2+" Erro ao adicionar usuario");
				}
			}
		});
		btnAdicionar.setBounds(194, 327, 110, 31);
		contentPane.add(btnAdicionar);
		
		btnListar = new JButton("Limpar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limparCampos();
			}
		});
		btnListar.setBounds(414, 327, 120, 31);
		contentPane.add(btnListar);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEndereo.setBounds(66, 213, 72, 14);
		contentPane.add(lblEndereo);
		
		textEndereco = new JTextField();
		textEndereco.setColumns(10);
		textEndereco.setBounds(196, 212, 315, 20);
		contentPane.add(textEndereco);
	}
	
	public void limparCampos(){
		textNome.setText("");
		textSobrenome.setText("");
		textTelefone.setText("");
		textEndereco.setText("");
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()== btnAdicionar){
			String nome=textNome.getText();
			int codigo=0;
			String sobrenome=textSobrenome.getText();
			String telefone=textTelefone.getText();
			String endereco =textEndereco.getText();
			String sexo = "null";
			try {
				ControllerEstudante.adicionarEstudante(codigo, nome, sobrenome, telefone, sexo);
				JOptionPane.showMessageDialog(null, "Usuario adicionado com sucesso");
				limparCampos();
			} catch (SQLException e2) {
				JOptionPane.showMessageDialog(null, "Erro ao adicionar usuario");
			}
		}
	}
	
}
