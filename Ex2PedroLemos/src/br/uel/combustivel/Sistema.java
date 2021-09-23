package br.uel.combustivel;

import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Bomba bomba = new Bomba(); 
		int opcao;
		String nome, nome2;
		double preco;
		do {
			System.out.println("Escolha uma op��o: ");
			System.out.println("(1) Cadastrar um novo combust�vel");
			System.out.println("(2) Usar uma bomba");
			System.out.println("(3) Sair");
			opcao = Integer.parseInt(input.nextLine());
			switch(opcao) {
				case 1:
					System.out.println("Insira o nome do combust�vel: ");
					nome = input.nextLine();
					System.out.println("Insira o pre�o do litro do combust�vel: ");
					preco = input.nextDouble();
					input.nextLine();
					bomba.addCombustivel(nome, preco);
					break;
				case 2:
					System.out.println("Insira o nome do combust�vel que ser� utilizado");
					nome2 = input.nextLine();
					bomba.selectCombustivel(nome2, input);
					break;
				case 3:
					break;
			}
			
		}while(opcao != 3);
		input.close();

	}

}
