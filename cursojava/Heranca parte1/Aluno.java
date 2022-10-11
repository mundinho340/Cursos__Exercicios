package Heranca;

public class Aluno extends Pessoa{
	String matr,curso;
	private String getMatr() {
		return matr;
	}
	
	public void setSetor(String matr) {
		this.matr =matr;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String Curso) {
		this.curso = curso;
	}
	public void CancerMatricula() {
		System.out.println("Cancelou matricula ...");
	}
	
	public String toString() {
		return super.toString()+" "+"curso: "+curso+" "+"matricula: "+matr;
	}
}
