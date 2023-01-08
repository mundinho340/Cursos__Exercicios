package somativasubs;

import java.util.ArrayList;
import java.util.Scanner;

public class EstacionarViatura {
	public static void main(String[] args) {
		menu();
	}
	
	public static ArrayList<Viatura> estacionarViatura(ArrayList<Viatura> viaturas){
		Viatura viatura = new Viatura();
		viaturas.add(viatura);
		return viaturas;
	}
	
	public static ArrayList<Viatura> retirarViatura(ArrayList<Viatura> viaturas, byte posicao){
		viaturas.remove(posicao);
		return viaturas;
		
	}
	
	public static void visualizarViaturas(ArrayList<Viatura> viaturas){
		for(int i =0 ; i<viaturas.size(); i++){
			System.out.println((i+1)+"o -> "+viaturas.get(i).toString());
		}
	}
	
	public static void menu(){
		byte opcao, posicao;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Viatura> viaturas = new ArrayList<Viatura>();
		do{
			System.out.println("===============Menu==================");
			System.out.println("[1]-> Estacionar viatura\n[2]-> Retirar Viatura\n[3]-> Visualizar viatura\n[4]-> Encerrar seccao");
			System.out.println("Escolha uma opção: ");
			opcao = scanner.nextByte();
			switch(opcao){
			case 1:
				viaturas =estacionarViatura(viaturas);
				break;
			case 2:
				System.out.println("Digite a posicao da viatura: ");
				posicao = scanner.nextByte();
				viaturas.remove(posicao);
			case 3:
				visualizarViaturas(viaturas);
			case 4:
				System.out.println("Programa Encerrado volte sempre");
			}
		}while(opcao!=4);
	}
	
}





















