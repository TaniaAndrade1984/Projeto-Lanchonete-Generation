package ProjetoLanchonete;

import java.util.Scanner;

public  class MenuCardapio {

	
	public void cardapioLanchonete() {
		
		Cliente client2 = new Cliente("Kimberly","Rua dos PR, 774", 11969696969L);
		Cliente client3 = new Cliente("Tommy Lee","Rua dos Pé de Jaca", 11987654321L);
		Cliente client1 = new Cliente(null, null, 0);
		String lanche []= {"","","","","","","","","",""};
		String bebidas []= {"","","","","","","","","",""};
		String sobremesa []= {"","","","","","","","","",""};
		int quantlanches [] = {0,0,0,0,0,0,0,0,0,0};
		int quantsobremesas[] = {0,0,0,0,0,0,0,0,0,0};
		int quantbebidas[] = {0,0,0,0,0,0,0,0,0,0};
	    int x=0,cod=0,quant=0,veri=0;
	    float valor,total,valorTotal=0;
	    Scanner leia = new Scanner(System.in);
//-----------------------------Lanches------------------------------------------	    
	    
	    do {
	    System.out.println("\n\t\t Lanches");
	    System.out.println("\n1-XBurguer = $15,00");
	    System.out.println("\n2-Xsalada = $17,00");
	    System.out.println("\n3-Xbacon = $18,00");
	    System.out.println("\n4-Smash Burguer = $10,00");
	    System.out.println("\n5-Xtudo = $22,00");
	    System.out.println("\n0-Não vou querer");
	    	do {
	    		System.out.println("\n Digite o codigo da sua compra");

	    		cod = leia.nextInt();
	    		if (cod <0 || cod >= 6) {
	    			System.out.println("Digite uma opção válida!");
	    		}
	    	}
	    	while (cod <0 || cod >= 6);
	    if (cod >= 1 && cod<= 5){
		    System.out.println("\n Digite a quantidade desse produto");
		    quant = leia.nextInt();
		    }
		    else
		    	 System.out.println("Obrigado");
	    switch(cod){
    	case 1:
    		total = quant*15;
    		valorTotal = total + valorTotal;
    		lanche [x] = "X-Burguer";
    		quantlanches [x] = quant;
    		System.out.printf("Você comprou "+quant+" X Burguer(s)");
    		break;
    	case 2:
    		total = quant*17;
    		valorTotal = total + valorTotal;
    		lanche [x] = "X-Salada";
    		quantlanches [x] = quant;
    		System.out.printf("Você comprou "+quant+" X Salada(s)");
    		break;
    	case 3:
    		total = quant*18;
    		valorTotal = total + valorTotal;
    		lanche [x] = "X-Bacon";
    		quantlanches [x] = quant;
    		System.out.printf("Você comprou "+quant+" X Bacon(s)");
    		break;
    	case 4:
    		total = quant*10;
    		valorTotal = total + valorTotal;
    		lanche [x] = "Smash Burguer";
    		quantlanches [x] = quant;
    		System.out.printf("Você comprou "+quant+" Smash Burguer(s)");
    		break;
    	case 5:
    		total = quant*22;
    		valorTotal = total + valorTotal;
    		lanche [x] = "X-Tudo";
    		quantlanches [x] = quant;
    		System.out.printf("Você comprou "+quant+" X Tudo");
    		break;
	    }
	    if (cod >= 1 && cod < 6) {
	    System.out.println("\nDeseja Comprar mais lanches?\n1 para sim, 2 para não");
	    veri = leia.nextInt();
	    }
	    x++;
	    }
	    while(veri == 1);
//-----------------------------Bebidas----------------------------------------------
	    x=0;
	    do {
	    System.out.println("\n\t\t Bebidas");
	    System.out.println("\n1-Coca = $5,00");
	    System.out.println("\n2-Fanta Laranja = $5,00");
	    System.out.println("\n3-Fanta uva = $5,00");
	    System.out.println("\n4-Guarana = $5,00");
	    System.out.println("\n5-Suco = $6,00");
	    System.out.println("\n0-Não vou querer");
	    
	    do {
    		System.out.println("\n Digite o codigo da sua compra");

    		cod = leia.nextInt();
    		if (cod <0 || cod >= 6) {
    			System.out.println("Digite uma opção válida!");
    		}
    	}
    	while (cod <0 || cod >= 6);
	    if (cod >= 1 && cod<= 5){
	    System.out.println("\n Digite a quantidade desse produto");
	    quant = leia.nextInt();
	    }
	    else
	    	 System.out.println("Obrigado");
	switch(cod) {
	case 1:
		total = quant*5;
		valorTotal = total + valorTotal;
		bebidas[x] = "Coca";
		quantbebidas[x] = quant;
		System.out.printf("Você comprou "+quant+" Coca(s)");
		break;
	case 2:
		total = quant*5;
		valorTotal = total + valorTotal;
		bebidas[x] = "Fanta Laranja";
		quantbebidas[x] = quant;
		System.out.printf("Você comprou "+quant+" Fanta Laranja(s)");
		break;
	case 3:
		total = quant*5;
		valorTotal = total + valorTotal;
		bebidas[x] = "Fanta Uva";
		quantbebidas[x] = quant;
		System.out.printf("Você comprou "+quant+" Fanta Uva(s)");
		break;
	case 4:
		total = quant*5;
		valorTotal = total + valorTotal;
		bebidas[x] = "Guarana";
		quantbebidas[x] = quant;
		System.out.printf("Você comprou "+quant+" Guaraná(s)");
		break;
	case 5:
		total = quant*6;
		valorTotal = total + valorTotal;
		bebidas[x] = "Suco";
		quantbebidas[x] = quant;
		System.out.printf("Você comprou "+quant+" Suco(s)");	
		break;
	}
		 if (cod >= 1 && cod < 6) {
			    System.out.println("\nDeseja Comprar mais bebidas?\n 1 para sim, 2 para não");
			    veri = leia.nextInt();
			    }
		 x++;
	}
	while(veri==1);
	//-------------------------SOBREMESAS--------------------------------------
	    x=0;
	    do {
	    System.out.println("\n\t\t Sobremesas");
	    System.out.println("\n1-Pudim = $7,00");
	    System.out.println("\n2-Brownie = $10,00");
	    System.out.println("\n3-Sorvete = $8,00");
	    System.out.println("\n0-Não vou querer");
	    do {
    		System.out.println("\n Digite o codigo da sua compra");

    		cod = leia.nextInt();
    		if (cod <0 || cod >= 4) {
    			System.out.println("Digite uma opção válida!");
    		}
    	}
    	while (cod <0 || cod >= 4);
	    if (cod >= 1 && cod<= 5){
		    System.out.println("\n Digite a quantidade desse produto");
		    quant = leia.nextInt();
		    }
		    else
		    	 System.out.println("Obrigado");
	    switch(cod){
	    	case 1:
	    		total = quant*7;
	    		valorTotal = total + valorTotal;
	    		sobremesa[x] = "Pudim";
	    		quantsobremesas[x] = quant;
	    		System.out.printf("Você comprou "+quant+" Pudim(s)");
	    		break;
	    	case 2:
	    		total = quant*10;
	    		valorTotal = total + valorTotal;
	    		quantsobremesas[x] = quant;
	    		sobremesa[x] = "Brownie";
	    		System.out.printf("Você comprou "+quant+" Brownie(s)");
	    		break;
	    	case 3:
	    		total = quant*8;
	    		valorTotal = total + valorTotal;
	    		quantsobremesas[x] = quant;
	    		sobremesa[x] = "Sorvete";
	    		System.out.printf("Você comprou "+quant+" Sorvete(s)");
	    		break;
	    }
		 if (cod >= 1 && cod < 4) {
			    System.out.println("\nDeseja Comprar mais sobremesas?\n para sim, 2 para não");
			    veri = leia.nextInt();
		}
		 x++;
		}
		while(veri==1);
	    if (valorTotal != 0f) {
	    System.out.printf("O Valor total dos itens foi: R$%.2f",valorTotal);
	    
	    System.out.println("\nÉ para entrega? 1 para sim, 2 para não");
	    veri = leia.nextInt();
	    if (veri == 1) {	    
	    leia.nextLine();
		System.out.println("\nInsira o nome do cliente: ");
		client1.setNome(leia.nextLine());
		System.out.println("Insira o endereço do cliente: ");
		client1.setEndereco(leia.nextLine());
		System.out.println("Insira o telefone do cliente: ");
		client1.setTelefone(leia.nextLong());
		System.out.println("\nNome do cliente: "+client1.getNome()+"\nEndereço: "+client1.getEndereco()+"\nTelefone: "+client1.getTelefone());
		System.out.println("\n");
	    }
	    for (x=0;x<lanche.length;x++) {
	    	if (lanche[x] != "") {
	    	System.out.println(quantlanches[x]+"-"+lanche[x]);
	    	}
	    }
	    for (x=0;x<lanche.length;x++) {
	    	if (bebidas[x] != "") {
		    	System.out.println(quantbebidas[x]+"-"+bebidas[x]);
		    }
	    }
	    for (x=0;x<lanche.length;x++) {
	    	if (sobremesa[x] != "") {
		    	System.out.println(quantsobremesas[x]+"-"+sobremesa[x]);
		    }
	    	
	    }
	    System.out.printf("\nO Valor total dos itens foi: R$%.2f",valorTotal);
	    System.out.println("\n Atendemos bem para atender Sempre!");
	    }else
	    	System.out.println("\n Atendemos bem para atender Sempre!");
	}
}
