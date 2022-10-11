package Heranca;

public class ProgramaPrincipal {
	public static void main (String[] args) {
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Raimundo");
		
		System.out.println(aluno.toString());
		System.out.println(professor.toString());
		System.out.println(funcionario.toString());
	}
}
