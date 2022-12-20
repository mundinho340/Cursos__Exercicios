package somativadepoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Estacionamento {
	public static void main(String[] args) {
		menu();
	}
	
	public static ArrayList<Viatura> estacionamento(ArrayList<Viatura> viaturas){
		Viatura viatura = new Viatura();
		viaturas.add(viatura);
		return viaturas;
		
	}
	
	public static ArrayList<Viatura> retirarViatura(ArrayList<Viatura> viaturas, byte posicao){
		viaturas.remove(posicao);
		return viaturas;
	}
	
	public static void visualizarViaturas(ArrayList<Viatura> viaturas){
		for(int i=0; i<viaturas.size();i++){
			System.out.println(i+". "+viaturas.get(i).toString());
		}
	}
	public static void menu(){
		Scanner scanner = new Scanner(System.in);
		byte opcao, posicao;
		
		ArrayList<Viatura> viaturas = new ArrayList<Viatura>();
		do{
			System.out.println("==================Menu===============");
			System.out.println("1-> Estacionar viatura");
			System.out.println("2-> Retirar viatura");
			System.out.println("3-> Visualizar viatura");
			
			System.out.println("/nPor favor, selecione uma opçáo: ");
			opcao = scanner.nextByte();
			
			switch(opcao){
			case 1:
				viaturas = estacionamento(viaturas);
				break;
			case 2:
				System.out.println("Digite a posição da viatura: ");
				posicao = scanner.nextByte();
				viaturas= retirarViatura(viaturas,posicao);
				break;
			case 3:
				visualizarViaturas(viaturas);
				break;
			case 0:
				System.out.println("Opcao invalida! por favor, selecione uma boa opcao valida ");
				break;
				
			}
		}while(opcao!=0);
	}
}
