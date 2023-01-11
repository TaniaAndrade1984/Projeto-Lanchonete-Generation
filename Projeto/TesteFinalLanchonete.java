package ProjetoLanchonete;

import java.io.IOException;
import java.util.Scanner;

public class TesteFinalLanchonete {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		CadastroCliente cliente = new CadastroCliente(null, null, null, 0, 0, null, null, 0);
		Funcionario1 func =  new Funcionario1(null, null, null, 0, 0, null, null, null, 0, 0);
		CadastroMotoca motoca = new CadastroMotoca(null, null, null, 0, 0, null, 0, 0, null);
		MenuCardapio menu = new MenuCardapio();

		int op;
// Sistema de menu do programa 
		while(true) {
			System.out.println("\n********* Menu Opcional ******** ");
			System.out.println("\n 1 - Pagina do Funcionário ");
			System.out.println("\n 2 - Cadastro dos Entregadores ");
			System.out.println("\n 3 - Cadastro de Cliente ");
			System.out.println("\n 4 - Menu/Cardápio ");
			System.out.println("\n 5 - Sair ");
			System.out.println("\n Digite Uma Opção:   ");
			op = leia.nextInt();
			if (op == 5) {
				System.out.println("\nSistema Finalizado com sucesso!");
				leia.close();
				System.exit(0);
			}
			
			switch(op){
			case 1:
				func.imprimirInfo();
				func.calcularSalario();
				keyPress();
				break;
				
			case 2:
				motoca.cadastroMotoca();
				keyPress();
				break;
			case 3:
				cliente.visualizar();
				keyPress();
				break;
			case 4:
				menu.cardapioLanchonete();
				keyPress();
				break;
			}

		}


	}
// Bloco para continuar o programa depois que escolher uma opção.
	private static void keyPress() {
		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}finally {
			System.out.println("\n\nPressione Enter para Continuar...");

		}

	}

}
