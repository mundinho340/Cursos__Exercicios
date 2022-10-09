package cursojava;

public class Ex1 {
	public static void main(String [] args) {
		ControloRemoto comando = new ControloRemoto();
		
		comando.ligarMudo();
		comando.ligar();
		comando.play();
		comando.abrirMenu();
	}
}
