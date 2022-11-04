package Somativa2;

import java.util.Scanner;

public class AlturasEstudantes {
	public static void main(String [] args) {
		menu();
	}
	
	public static float[] registarAlturas() {
		Scanner scanner = new Scanner(System.in);
		float[] alturas = new float[12];
		for(byte i =0; i< alturas.length; i++) {
			System.out.println("Digite a altura: ");
			alturas[i] = validarAltura((float) 1, (float) 2.70f,i);
		}
		return alturas;
	}
	
	public static float validarAltura(float alturaMin, float alturaMax,byte posicoes) {
		Scanner scanner = new Scanner(System.in);
		float altura;
		System.out.println("Digite a altura do "+(posicoes +1)+"* aluno");
		do {
			altura= scanner.nextFloat();
			if(altura< alturaMin|| altura> alturaMax) {
				System.out.println("Altura invalida tente novamente : ");
				
			}
		}while(altura< alturaMin|| altura> alturaMax);
		return altura;
	}
	
	public static void visualizarAlturas(float[] alturas) {
		byte contAlto =0,contBaixo=0,contMedio=0;
		System.out.println("Altura dos estudantes ");
		for(byte i=0; i<alturas.length;i++) {
			if(alturas[i]>1.70) contAlto ++;
			else if(alturas[i]>1.55) contMedio++;
			else contBaixo ++;
		}
		
		System.out.println("No total são: "+contAlto+" altos "+contMedio+" medios "+contBaixo+" baixos");
	
	}
	
	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		float [] alturasEstudantes = new float [12];
		byte opcoes;
		do {
			System.out.println("1. Registar alturas \n 2. Visualizar alturas \n 3. Sair");
			System.out.println("Escolha uma opcao: ");
			opcoes = scanner.nextByte();
			switch(opcoes) {
			case 1:
				alturasEstudantes = registarAlturas();
				break;
			case 2:
				visualizarAlturas(alturasEstudantes);
				break;
			case 3:
				System.out.println("Fim");
			}
		}while(opcoes !=3);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
