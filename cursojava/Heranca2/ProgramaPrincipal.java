package Heranca2;

public class ProgramaPrincipal {
	public static void main(String [] main) {
		Aluno aluno = new Aluno();
		Bolsista bolsista = new Bolsista();
		aluno.setNome("Raimundo");
		aluno.PagarMensalidade();
		
		bolsista.setNome("Raimundo");
		bolsista.pagarMensalidade();
		bolsista.renovarBolsa();
		
	
	}
	
	
}
