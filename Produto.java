package somativa2;

import java.util.Scanner;

public class Produto {
	private String nome;
	
	public Produto() {
		this.nome=escreverNome();
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String toString() {
	
		return "nome: "+nome;
	}
	
	public static String escreverNome(){
		String atributo;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome do produto: ");
		atributo= scanner.next();
		return atributo;
		
	}
	
}
