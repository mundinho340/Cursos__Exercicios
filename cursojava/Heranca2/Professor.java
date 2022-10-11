package Heranca2;

public class Professor extends Pessoa{
	private String especialidade ;
	private float salario;
	public float getSalario() {
		return salario;
	}
	
	private void setSalario(float salario) {
		this.salario =salario;
	}
	
	private String especialidade() {
		return especialidade;
	}
	
	private void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public void receberAum(float au) {
		this.salario+=au;
	}
	
	public String toString() {
		return super.toString() +"especialidade -> " +especialidade+" "+"Salario -> "+salario + " ]";
	}
	
}
