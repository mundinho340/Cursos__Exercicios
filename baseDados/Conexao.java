package baseDados;

import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class Conexao{
	
	Connection conexao=null;
	String driver="org.gjt.mm.mysql.Driver";
	String url="jdbc:mysql://localhost/testar";
	public Connection conectar(){
		try{
			if(conexao==null){
				Class.forName(driver);
				conexao= DriverManager.getConnection(url,"root","");
				//JOptionPane.showMessageDialog(null, "Conectado com sucesso");		
			}
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e.toString());	
		}
		return conexao;
	}
}
