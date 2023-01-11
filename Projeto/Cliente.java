package ProjetoLanchonete;

public class Cliente {
	private String nome;
	private String endereco;
	private long telefone;
	public Cliente(String nome, String endereco, long telefone){
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	public Cliente (String nome, long telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
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
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public void ImprimirCliente() {
		System.out.println("\nNome do cliente: "+getNome()+"\nEndereço: "+getEndereco()+"\nTelefone: "+getTelefone());
	}
	public void ImprimirMotoboy() {
		System.out.println("\nNome Entregador: "+getNome()+"\nTelefone: "+getTelefone());
	}
}

