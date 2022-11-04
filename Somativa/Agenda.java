package cursojava;

import java.util.Scanner;

public class Agenda {
	public static void main(String [] args) {
		Contacto[] contactos =adicionarContacto() ;
		visualizarContacto(contactos);
		
		
	}
	
	public static int definirQuantidade(byte quantMax, byte quantMin) {
		Scanner scanner = new Scanner(System.in);
		int quantidade;
		System.out.println("Quantos contactos desejas adicionar na agenda: ");
		do {
			quantidade = scanner.nextInt();
			if(quantidade>quantMax|| quantidade< quantMin) {
				System.out.println("QUantidade invalida tente novamente: ");
			}
		}while(quantidade>quantMax|| quantidade< quantMin);
		return quantidade;
	}
	
	public static Contacto[] adicionarContacto() {
		int quantidade = definirQuantidade((byte)5, (byte)1);
		Contacto[] contactos = new Contacto[quantidade];
		for(int i =0 ; i< contactos.length; i++) {
			System.out.println("Por favor, preencha os dados do "+(i+1)+"o contacto");
			Contacto contacto = new Contacto();
			contactos[i] = contacto;
		}
		return contactos;
	}
	
	public static void visualizarContacto(Contacto[] contacto) {
		for(byte j =0; j<contacto.length; j++) {
			System.out.println((j+1)+"o "+contacto[j].toString());
		}
	}

}

















