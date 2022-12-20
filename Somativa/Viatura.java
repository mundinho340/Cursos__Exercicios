package somativadepoo;

import java.util.Scanner;

public class Viatura {
	private String matricula;
	public Viatura() {
		this.matricula=informarMatricula();
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMatricula() {
		return matricula;
	}
	
	@Override
	public String toString() {
		return "viatura: "+matricula;
	}
	
	private String informarMatricula(){
		Scanner scanner = new Scanner(System.in);
		String matricula;
		System.out.println("Por favor, digite a matricula do carro: ");
		matricula = scanner.nextLine();
		return matricula;
	}
	
}
