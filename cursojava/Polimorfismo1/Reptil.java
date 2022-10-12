package Polimorfismo;

public class Reptil extends Animal{
	private String corEscamas;

	@Override
	public void locomover() {
		System.out.println("Rastejando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo folhas");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de reptil");
		
	}
}
