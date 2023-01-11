package ProjetoLanchonete;

import java.util.Scanner;

public class CadastroMotoca extends Lanchonete1 {
	Scanner leia = new Scanner(System.in);
	private long crlv;
	private long cnh;
	private String placa;
	public CadastroMotoca(String nome, String endereco, String genero, int idade, int telefone, String cpf, long crlv,
			long cnh, String placa) {
		super(nome, endereco, genero, idade, telefone, cpf);
		this.crlv = crlv;
		this.cnh = cnh;
		this.placa = placa;
	}
	public long getCrlv() {
		return crlv;
	}
	public void setCrlv(long crlv) {
		this.crlv = crlv;
	}
	public long getCnh() {
		return cnh;
	}
	public void setCnh(long cnh) {
		this.cnh = cnh;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void cadastroMotoca() {
		System.out.println("\n\t\t Seja Bem vindo Entregador!");

		System.out.println("\n Digite sua idade: ");
		idade = leia.nextInt();
		if(idade >= 18) {

			System.out.println("\n Digite sua CNH: ");
			cnh = leia.nextLong();

			System.out.println("\n Digite seu CRLV: ");
			crlv = leia.nextLong();

			System.out.println("\n Digite sua Placa: ");
			placa = leia.next();
			
			System.out.println("\n Qual seu genero: ");
			genero = leia.next();

			System.out.println("Cadastro Aprovado, ja pode começar a trabalhar conosco! ");
		}else {
			System.out.println("Menor de Idade! Não podemos Continuar");
		}
	}
}
