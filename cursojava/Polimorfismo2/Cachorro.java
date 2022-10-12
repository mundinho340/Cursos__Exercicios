package Polimorfismo2;

public class Cachorro extends Lobo{
	String frase ;
	int horario, min,idade;
	boolean dono;
	float peso;

	
	
	public void emitirSom() {
		System.out.println("Au! Au! Au!");
	}
	
	public void reagir(String frase) {
		if(frase =="Ola" || frase== "vem comer") {
			System.out.println("Abanando o rabo");
		}
		else {
			System.out.println("Cão rosnando");
		}
	}
	
	public void reagir(int hora, int min) {
		if(hora >=6 || hora <=12) {
			System.out.println("Abanar rabo");
		}
		
		else if(hora <=17) {
			System.out.println("Abanar e latir");
		}
		else {
			System.out.println("Ignorar");
		}
	}
	
	public void reagir(boolean dono) {
		if(dono ==true) {
			System.out.println("Abanar rabo");
		}
		else {
			System.out.println("Rosnar");
		}
	}
	
	public void reagir(int idade , float peso){
		if (idade<5 && peso<=10){
			System.out.println("Abando o rabo");
		}
		else if(idade<10 || peso<10) {
			System.out.println("Rosnar");
		}
		else {
			System.out.println("ignorar");
		}
	}
	
	
}











