package Controlador;
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
	
	public static void adicionarEstudante(int codigo,String nome, double nota1,double nota2) throws SQLException{
		Conexao conexao=new Conexao();
		Connection cone= conexao.conectar();
		
		PreparedStatement insercao=null;
		insercao = cone.prepareStatement("insert into estudante1 values(?,?,?,?)");
		
		insercao.setInt(1, codigo);
		insercao.setString(2, nome);
		insercao.setDouble(3, nota1);
		insercao.setDouble(4, nota2);
		insercao.executeUpdate();
		cone.close();
		
	}
	
	public static ArrayList<Estudante> listaDeEstudantes() throws SQLException{
		
		
		
		ArrayList<Estudante> estudantes=new ArrayList<Estudante>();
		
		Conexao conexao=new Conexao();
		Connection cone= conexao.conectar();
		
		PreparedStatement selecao=null;
		
		selecao=cone.prepareStatement("select * from estudante1");
		ResultSet registros= (ResultSet) selecao.executeQuery();
		while(registros.next()){
			int codigo=registros.getInt(1);
			String nome=registros.getString(2);
			double teste1=registros.getDouble(3);
			double teste2=registros.getDouble(4);
			
			estudantes.add(new Estudante(codigo,nome,teste1,teste2));
		}
			return estudantes;
		
	}
	

	
	public static void actualizar(int codigo,String nome, double nota1,double nota2) throws SQLException{
		

		Conexao conexao=new Conexao();
		Connection cone= conexao.conectar();
		
		PreparedStatement actualizar=null;
		actualizar=cone.prepareStatement("update estudante1 set nome=?,teste1=?,teste2=? where id=?");
		
		actualizar.setString(1, nome);
		actualizar.setDouble(2, nota1);
		actualizar.setDouble(3, nota2);
		actualizar.setInt(4, codigo);
		actualizar.executeUpdate();
	}
	public static void apagar(String nome) throws SQLException{
		Conexao conexao=new Conexao();
		Connection cone= conexao.conectar();
		
		PreparedStatement remover=null;
		remover=cone.prepareStatement("delete from estudante1 where nome=?");
		
		remover.setString(1, nome);
		remover.executeUpdate();
	}
	
}
