package Entidade;
public class Estudante {

	 private int codigo;
	 private String nome,sobrenome,telefone,sexo,endereco; 
	 public Estudante (int codigo,  String nome, String sobrenome,
				String telefone,String endereco,String sexo){
		 	this.codigo=codigo;
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.telefone = telefone;
			this.sexo = sexo; 
			this.endereco = endereco;
			
	 }
	public Estudante(String nome, String sobrenome,
			String telefone, String endereco,String sexo) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
		this.endereco=endereco;
		this.sexo = sexo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return endereco;
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
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
