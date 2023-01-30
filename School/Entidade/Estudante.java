package Entidade;
public class Estudante {

	 private int codigo;
	 private String nome;
	 private double nota1;
	 private double nota2;
	 
	 public Estudante (){
		 
	 }
	 public Estudante(int codigo,String nome, double nota1,double nota2){
		 this.codigo = codigo;
		 this.nome = nome;
		 this.nota1 = nota1;
		 this.nota2 = nota2;
		 
	 }
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double calculaMedia(){
		return (nota1+nota2)/2;
	}
	public String verificarSituacao(double media){
		String 	situacao;
		if (media<9.5){
			situacao="excluido";
		}
		else if(media<13.5){
			situacao="admitido";	
		}
		else {
			situacao="dispensado";
		}
		return situacao;
	}
	public String toString(){
		double media=calculaMedia();
		String situacao=verificarSituacao(media);
		return codigo +"-"+ nome +"-" + nota1 +"-" + nota2+"-"+media+ "-"+ situacao;
	}
	
}
