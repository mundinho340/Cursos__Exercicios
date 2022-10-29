package Somativa;

import java.util.Scanner;

public class DescontoSalario {
	public static void main(String []args ) {
		int qfaltas;
		float salario = 7800;
		double desconto = 7800;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantidade de faltas: ");
		qfaltas =scanner.nextInt();
		
		if(qfaltas> 17) {
			desconto = salario -(salario*0.17);
		}
		else if(qfaltas>10) {
			desconto = salario -(salario*0.1);
		}
		else if(qfaltas> 7) {
			desconto = salario -(salario*0.15);
		}
		
		System.out.println("O salario atual com desconto: "+desconto);
	}
}
