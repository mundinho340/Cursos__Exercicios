package cursojava;

import java.io.FileWriter;
import java.io.IOException;

public class Total {
	public static void main(String []args) {
		try {
			FileWriter writer = new FileWriter("Os_Melhor_Programador.txt");
			writer.write("Krypthon é o melhor programador de todos os tempos ...\n");
			writer.write("Acredite em teus sonhos e lute para concretizalos \n");
			writer.write("Faça 1% todos os dias porque a direcção é mais importante que a velocidade");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
