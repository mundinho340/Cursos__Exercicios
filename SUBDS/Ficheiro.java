package SUBDS;

import java.io.File;
//Krypthon
public class Ficheiro {
	public static void main(String [] args) {
		File f1 = new File("C:/xampp/raimundo.txt");
		if(f1.exists()) {
			System.out.println("Ficheiro existe");
		}
		else {
			System.out.println("Ficheiro não existe");
		}
	}
}
