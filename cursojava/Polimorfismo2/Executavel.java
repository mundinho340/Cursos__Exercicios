package Polimorfismo2;

public class Executavel {
	public static void main(String [] args) {
		Cachorro cachorro = new Cachorro();
		
		cachorro.reagir(true);
		cachorro.reagir(12, 10);
		cachorro.reagir(10, 20);
		cachorro.reagir("Ola");
	}
}
