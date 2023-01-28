package Controladores;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.*;
import java.sql.*;

import javax.swing.*;

import Entidade.Estudante;
import baseDados.Conexao;

//import com.mysql.jdbc.ResultSet;

public class ControllerEstudante {
	
	static Scanner brain=new Scanner(System.in);
	
	public static void adicionarEstudante(String nome, String sobrenome,String telefone,String endereco, String sexo) throws SQLException{
		Conexao conexao=new Conexao();
		Connection cone= conexao.conectar();
		
		PreparedStatement insercao=null;
		insercao = cone.prepareStatement("insert into aluno (nome, sobrenome, telefone, endereco, sexo) values(?,?,?,?,?)");
		insercao.setString(1, nome);
		insercao.setString(2, sobrenome);
		insercao.setString(3, telefone);
		insercao.setString(4, endereco);
		insercao.setString(5, sexo);
		insercao.executeUpdate();
		cone.close();
		
	}
	
	public static ArrayList<Estudante> listaDeEstudantes() throws SQLException{
		
		
		
		ArrayList<Estudante> estudantes=new ArrayList<Estudante>();
		
		Conexao conexao=new Conexao();
		Connection cone= conexao.conectar();
		
		PreparedStatement selecao=null;
		
		selecao=cone.prepareStatement("select * from aluno");
		ResultSet registros= (ResultSet) selecao.executeQuery();
		while(registros.next()){
			int codigo= registros.getInt(1);
			String nome=registros.getString(2);
			String sobrenome=registros.getString(3);
			String telefone=registros.getString(4);
			String endereco = registros.getString(5);
			String sexo = registros.getString(6);
			
			
			estudantes.add(new Estudante(codigo,nome,sobrenome,telefone,endereco, sexo));
		}
			return estudantes;
		
	}
	

	
	public static void actualizar(String nome, String sobrenome, String telefone,String endereco, String sexo) throws SQLException{
		

		Conexao conexao=new Conexao();
		Connection cone= conexao.conectar();
		
		PreparedStatement actualizar=null;
		actualizar=cone.prepareStatement("update aluno set nome=?,sobrenome=?,telefone=?,endereco=? sexo=?  where nome=?");
		
		actualizar.setString(1, nome);
		actualizar.setString(2, sobrenome);
		actualizar.setString(3, telefone);
		actualizar.setString(4, endereco);
		actualizar.setString(5, sexo);
		//actualizar.setInt(5, codigo);
		actualizar.executeUpdate();
	}
	public static void apagar(String nome) throws SQLException{
		Conexao conexao=new Conexao();
		Connection cone= conexao.conectar();
		
		PreparedStatement remover=null;
		remover=cone.prepareStatement("delete from aluno where nome=?");
		
		remover.setString(1, nome);
		remover.executeUpdate();
	}
	
}
