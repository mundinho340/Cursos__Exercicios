package olll;

import java.util.ArrayList;
import java.util.Scanner;

public class Turma {
	public static void main(String[] args) {
		ArrayList<Estudante> estudantes = new ArrayList<Estudante>();
		adicionarEstudante(estudantes);
	}
	public static ArrayList<Estudante>  adicionarEstudante(ArrayList<Estudante> estudantess){
		Scanner scanner = new Scanner(System.in);
		String res = "";
		ArrayList<Estudante> estudantes = new ArrayList<Estudante>();
		
		Estudante estudante = new Estudante();
		for(byte i =0; i<2 ; i++)
			estudantes.add(estudante);
		return estudantes;
	}
}
