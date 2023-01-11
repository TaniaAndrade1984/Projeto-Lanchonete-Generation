package ProjetoLanchonete;

public abstract class Lanchonete1 {
	protected String nome;
	protected String endereco;
	protected String genero;
	protected int idade;
	protected int telefone;
	protected String cpf;


	public Lanchonete1(String nome, String endereco, String genero, int idade, int telefone, String cpf) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.genero = genero;
		this.idade = idade;
		this.telefone = telefone;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	 

}
