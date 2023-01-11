package ProjetoLanchonete;

import java.util.Scanner;

public class Funcionario1 extends Lanchonete1 {
	Scanner leia = new Scanner(System.in);
	private String cargo;
	private String setor;
	private double salario;
	private float imposto;

	public Funcionario1(String nome, String endereco, String genero, int idade, int telefone, String cpf, String cargo,
			String setor, double salario, float imposto) {
		super(nome, endereco, genero, idade, telefone, cpf);
		this.cargo = cargo;
		this.setor = setor;
		this.salario = salario;
		this.imposto = imposto;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}



	public void imprimirInfo() {
		
		System.out.println("\n Digite seu nome: ");
		nome = leia.next();
		
		System.out.println("\n Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("\n Digite seu Endereço: ");
		endereco = leia.next();
		leia.next();
		
		System.out.println("\n Qual seu Genero: ");
		genero = leia.next();
		
		System.out.println("\n Digite seu Cargo: ");
		cargo = leia.next();
		
		System.out.println("\n Digite seu Setor: ");
		setor = leia.next();
		
		System.out.println("\n Digite seu Salário: ");
		salario = leia.nextDouble();
		
		System.out.println("\n Digite seu Imposto: ");
		imposto = leia.nextFloat();
		
		
	}

	public void calcularSalario() {
		double valorTotal = salario - (salario *(imposto/100));
		System.out.println("\nO salário líquido a ser recebido pelo empregado, " +getNome()+" depois do imposto calculado, é igual a: "+valorTotal);

	}

}
