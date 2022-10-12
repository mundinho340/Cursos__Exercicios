package Polimorfismo2;

public abstract class Animal {
	private float peso;
	private int idade, membros;
	
	public void Animal() {
		this.peso =peso;
		this.idade=idade;
		this.membros=membros;
	}
	
	public float getPeso() {
		return peso;
	}
	
	abstract public void locomover();
	abstract public void alimentar();
	abstract public void emitirSom();
}
