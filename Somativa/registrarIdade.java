package somativadepoo;

import java.util.Scanner;

public class registrarIdade {
	public static void main(String[] args) {
		float idadeAluno[]= new float[19];
		idadeAluno = registarIdade();
		visualizarIdade(idadeAluno);
	}
	

	public static float[] registarIdade() {
		Scanner scanner = new Scanner(System.in);
		float[] idades = new float[12];
		for(byte i =0; i< idades.length; i++) {
			System.out.println("Digite a idade: ");
			idades[i] = validarIdade((float) 12, (float) 59,i);
		}
		return idades;
	}
	
	public static float validarIdade(float idadeMin, float idadeMax,byte posicoes) {
		Scanner scanner = new Scanner(System.in);
		float idade;
		System.out.println("Digite a idade do "+(posicoes +1)+"* aluno");
		do {
			idade= scanner.nextFloat();
			if(idade< idadeMin|| idade> idadeMax) {
				System.out.println("Idade invalida tente novamente : ");
				
			}
		}while(idade< idadeMin|| idade> idadeMax);
		return idade;
	}
	
	public static void visualizarIdade(float[] idades) {
		byte adultos =0,jovens=0,adolescentes=0;
		System.out.println("idade dos estudantes ");
		for(byte i=0; i<idades.length;i++) {
			if(idades[i]>39) adultos ++;
			else if(idades[i]>18) jovens++;
			else adolescentes ++;
		}
		
		System.out.println("No total são: "+adolescentes+" adolescentes "+jovens+"jovens "+adultos+" adultos");
	
	}
}
