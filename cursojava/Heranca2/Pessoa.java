package Heranca2;
public abstract class Pessoa {
	private String nome, sexo;
	private int idade;
	public Pessoa() {
		this.nome=nome;
		this.sexo =sexo;
		this.idade =idade;
	}
	
	public String getNome () {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo =sexo;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade =idade;
	}
	
	public void fazerAniversario() {
		this.idade++;
	}
	
	public String toString() {
		return "[ nome -> "+nome +", "+"Sexo-> "+sexo+", "+"Idade-> "+idade+" " ;
	}
}
