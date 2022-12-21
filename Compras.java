package somativa2;

import java.util.ArrayList;
import java.util.Scanner;

public class Compras {
	public static void main(String[] args) {
		menu();
	}
	
	public static ArrayList<Produto> adicionarProduto(ArrayList<Produto> produtos){
		Produto produto = new Produto();
		produtos.add(produto);
		return produtos;
	}
	
	public static ArrayList<Produto> removerProduto(ArrayList<Produto> produtos, int posicao){
		produtos.remove(posicao);
		return produtos;
	}
	
	public static void visualizarProduto(ArrayList<Produto> produtos){
		for(int i =0; i< produtos.size(); i++){
			System.out.println((i)+"o-> " +produtos.get(i).toString());
		}
	}
	
	public static void menu(){
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		Scanner scanner = new Scanner(System.in);
		int opcao, posicao;
		do{
			System.out.println("===============Menu================");
			System.out.println("[1] -> Adicionar Produto\n[2] -> Remover Produto\n[3] -> Visualizar Produto\n[4] -> Encerrar a Sessão");
			System.out.println("Digite a opção correcta: ");
			opcao = scanner.nextInt();
			
			switch(opcao){
			case 1:
				produtos= adicionarProduto(produtos);
				break;
			case 2:
				System.out.println("Digite a posicao: ");
				posicao =scanner.nextInt();
				produtos.remove(opcao);
				break;
			case 3:
				visualizarProduto(produtos);
				break;
			case 4:
				System.out.println("Fim do programa, volte sempre");
				break;
			default:
				System.out.println("Opção invalida");
				
			}
					
		}while(opcao!=4);
	}
}
