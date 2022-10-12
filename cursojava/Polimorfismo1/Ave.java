package Polimorfismo;

public class Ave extends Animal{
	private String corPenas;

	@Override
	public void locomover() {
		System.out.println("Voando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo frutas");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de ave ");
		
	}
	
	public void fazerNinho() {
		System.out.println("Fazendo ninho ...");
	}
}
