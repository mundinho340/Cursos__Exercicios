package cursojava;

import java.util.Scanner;

public class Contacto {
	String nome ,sobrenome, telephone;
	
	public Contacto() {
		nome = definirCampo("nome");
		nome = definirCampo("sobrenome");
		telephone = definirCampo("telephone");
	}
	
	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	 public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	 
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "nome: "+nome+" || sobrenome: "+sobrenome+" || Numero: "+telephone;
	}
	 
	 private String definirCampo(String campo) {
		 Scanner scanner = new Scanner(System.in);
		 String atributo ;
		 System.out.println("Digite o "+campo+" do  contacto: ");
		 atributo = scanner.next();
		 return atributo; 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
