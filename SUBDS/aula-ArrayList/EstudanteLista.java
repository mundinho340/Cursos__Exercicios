package olll;

import java.util.ArrayList;

public class EstudanteLista {
	public static void main(String[] args) {
		ArrayList<Estudante> estudantes = new ArrayList<Estudante>();
		Estudante estudante = new Estudante();
		Estudante estudante1= new Estudante();
		Estudante estudante2 = new Estudante();
		estudantes.add(estudante);
		estudantes.add(estudante1);
		estudantes.add(estudante2);
		
		System.out.println(estudantes);
		estudantes.remove(estudantes.get(1));
		System.out.println(estudantes);
	}
}
