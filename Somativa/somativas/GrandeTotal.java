package somativas;

import java.util.Scanner;

public class GrandeTotal {
	public static int validarQuantidade(int quantMax,int quantMin) {
		Scanner scanner = new Scanner(System.in);
		int quantidade;
		System.out.println("Digite a quantidade de livros: ");
		do {
			quantidade = scanner.nextInt();
			if(quantidade> quantMax || quantidade< quantMin) {
				System.out.println("Quantidade invalida tente novamente: ");
			}
		}while(quantidade> quantMax || quantidade< quantMin);
		return quantidade;
		
	}
	
	public static Livro[] adicionarLivros() {
		int quantidade = validarQuantidade((int) 5,(int) 1);
		Livro [] livros = new Livro[quantidade];
		for(int i=0; i<livros.length; i++) {
			System.out.println("Digite os dados do "+(i+1)+"o livro");
			Livro livro = new Livro();
			livros[i] = livro;
		}
		return livros;
	}
	
	public static void vizualizarLivro(Livro[] livros) {
		int totalPreco=0;
		for(int i=0; i<livros.length; i++) {
			System.out.println((i+i)+"o livro");
			System.out.println(livros[i].toString());
			totalPreco += livros[i].getPrecoUnitario();
			
		}
		System.out.println("O preço total é : "+totalPreco);
	}
	
	public static void main(String args[]) {
		Livro livros[] =adicionarLivros();
		vizualizarLivro(livros);
	}
}











