package Somativa2;

public class MatrizSomaPosicoes {
	public static void main(String [] args) {
		int [][] soma = new int [3][3];
		for(byte i =0; i<3; i++) {
			for(byte j =0; j<3; j++) {
				soma[i][j]=i+j;
				System.out.print(" "+soma[i][j]);
			}
			System.out.println();
		}
	}
}
