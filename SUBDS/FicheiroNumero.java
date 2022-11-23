package SUBDS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FicheiroNumero {
	public static void main(String []args) throws IOException{
		String nomeFicheiro = "Criatnum.txt";
		escreverNumeroFicheiro(nomeFicheiro);
		lerFicheiroNumero(nomeFicheiro);
	}
	
	public static void escreverNumeroFicheiro(String nomeFicheiro) throws IOException{
		final int MAX =15;
		String str="";
		FileWriter fw = new FileWriter(nomeFicheiro);
		BufferedWriter fileOut = new BufferedWriter(fw);
		
		for(int i =1; i<= MAX; i++) {
			fileOut.write(str.valueOf(i));
			fileOut.newLine();
		}
		fileOut.close();
		System.out.println("O ficheiro foi criado com nome "+nomeFicheiro);
	}
	
	public static void lerFicheiroNumero(String ficheiroNumero) throws IOException{
		int numero ; byte cont=0; long prod=1;
		String umaLinha="";
		FileReader fr = new FileReader(ficheiroNumero);
		BufferedReader fileOut =new BufferedReader(fr);
		
		while (umaLinha != null) {
			umaLinha = fileOut.readLine();
			if(umaLinha != null) {
				numero = Integer.parseInt(umaLinha);
				System.out.println(numero);
				prod *= numero;
				cont ++;
				
			}else {
				System.out.println("Fim do ficheiro!");
			}
		}
		fileOut.close();
		System.out.println("Produto de "+cont+" numeros="+prod);
		
	}
	
	
	
}







































