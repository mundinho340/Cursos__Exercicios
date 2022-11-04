package Somativa;

import java.util.Scanner;

public class DefeitoIphone {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		float espessura = (float) 0;
		System.out.println("Digite a espessura do dispositivo");
		espessura = scanner.nextFloat();
		
		if(espessura != 7.4f) {
			System.out.println("Dispositivo defeituoso por favor devolva a correção");
		}
	}
}

