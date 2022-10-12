package Polimorfismo;

public class Peixe extends Animal{
	private String corPelos;

	@Override
	public void locomover() {
		System.out.println("Nadando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("comendo algas");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som");
		
	}
	
	public void soltarBolha() {
		System.out.println("Peixe soltando bolha");
	}
}
