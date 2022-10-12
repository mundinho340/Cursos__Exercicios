package Polimorfismo;

public class Mamifero extends Animal{
	private String corPelos;

	@Override
	public void locomover() {
		System.out.println("Correndo");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Mamar");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Mamifero emite som ");
		
	}
}
