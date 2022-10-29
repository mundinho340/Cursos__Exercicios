package Somativa;

import java.util.Scanner;

public class PrecoEscucao {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		double totalValor=0;
		float precoViagem=620;
		int passageiroVinte = 0,Qpessoas;
		int i =0;
		
		do {
			System.out.println("Digite a quantidade de pessoas: ");
			Qpessoas = scanner.nextInt();
			if(Qpessoas >20) {
				passageiroVinte +=1;
				totalValor = precoViagem-(precoViagem*0.15);
			}
			else {
				totalValor=precoViagem;
			}
			System.out.println("O valor a pagar pela viagem é : "+totalValor);
			i+=1;
		}while(i<7);
		System.out.println("======================================================================");
		System.out.println("====================A agencia de viagem fechou========================");
		System.out.println("================Total de viagens com mais de 20 pessoas: "+passageiroVinte+" ===========");
		System.out.println("======================================================================");
		
	}
}
