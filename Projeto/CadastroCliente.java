package ProjetoLanchonete;

import java.util.Scanner;

public class CadastroCliente extends Lanchonete1{
	Scanner leia = new Scanner(System.in);

	private String email;
	private long senha;

	public CadastroCliente(String nome, String endereco, String genero, int idade, int telefone, String cpf,
			String email, long senha) {
		super(nome, endereco, genero, idade, telefone, cpf);
		this.email = email;
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public long getSenha() {
		return senha;
	}

	public void setSenha(long senha) {
		this.senha = senha;
	}
	public void visualizar() {
		System.out.println("\t\t LOGIN ");

		System.out.println("\n Digite seu CPF: ");
		cpf = leia.next();

		System.out.println("\n Digite seu email: ");
		email = leia.next();		

		System.out.println("\n Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("\n Qual seu genero: ");
		genero = leia.next();

		System.out.println("\n Digite sua senha: ");
		senha = leia.nextInt();	

		if(idade >= 18) {
			System.out.println("\n Cadastro Aprovado !!! ");

		}else {
			System.out.println("\n Desculpe, Voçê ainda não pode se cadastrar ! ");
		}
	}



}
