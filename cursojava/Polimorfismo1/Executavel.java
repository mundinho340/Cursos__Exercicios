package Polimorfismo;

public class Executavel {
	public static void main (String []args) {
		Arara arara = new Arara();
		GoldFish fish = new GoldFish();
		Canguru canguru = new Canguru();
		Cachorro cachorro = new Cachorro();
		Cobra cobra = new Cobra();
		Tartaruga tartaruga = new Tartaruga();
		
		cobra.locomover();
		tartaruga.locomover();
	}
}
