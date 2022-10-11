package Heranca;

public class Funcionario extends Pessoa{
	private String setor;
	boolean trabalhando;

	public String getSetor() {
		return setor;
	}
	
	public void setSetor(String setor) {
		this.setor =setor;
	}
	
	public boolean getTrabalhando() {
		return trabalhando;
	}
	
	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	public void mudarTrabalho() {
		setTrabalhando(!this.trabalhando);
	}
	
	public String toString() {
		return super.toString() +" Setor -> " +setor+" "+"Trabalhando -> "+trabalhando+ " ]";
	}

}
