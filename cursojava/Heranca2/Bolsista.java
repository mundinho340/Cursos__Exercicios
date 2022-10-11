package Heranca2;

public final class Bolsista extends Aluno{
	private float bolsa;
	public void renovarBolsa() {
		System.out.println("Renovou a bolsa do bolsista "+getNome());
	}
	
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade de bolsista , pagamento facilitado");
	}
	
	public float getBolsa() {
		return bolsa;
	}
	
	public void setBolsa(float bolsa) {
		this.bolsa =bolsa;
	}
}
