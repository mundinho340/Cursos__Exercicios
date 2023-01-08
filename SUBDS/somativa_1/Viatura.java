package somativasubs;

import java.util.Scanner;

public class Viatura {
	private String matricula;
	public Viatura() {
		this.matricula=escreverMatricula();
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public String escreverMatricula(){
		String atributo;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite os dados da matricula: ");
		atributo = scanner.next();
		return atributo;
	}
	
	
	public String toString() {
		return "matricula: "+matricula;
	}
}
