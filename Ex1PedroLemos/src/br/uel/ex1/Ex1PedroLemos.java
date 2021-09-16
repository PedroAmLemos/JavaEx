package br.uel.ex1;

import java.util.Scanner;

public class Ex1PedroLemos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira um nome: ");
		String nome = input.nextLine();

		System.out.print("Insira um sobrenome: ");
		String sobrenome = input.nextLine();
		
		System.out.print("Insira o dia de nascimento: ");
		int diaNascimento = input.nextInt();

		System.out.print("Insira o mes de nascimento: ");
		int mesNascimento = input.nextInt();

		System.out.print("Insira o ano de nascimento: ");
		int anoNascimento = input.nextInt();
		
		HeartRates pessoa = new HeartRates(nome, sobrenome, diaNascimento, mesNascimento, anoNascimento);
		pessoa.printDados();


		input.close();
	}

}
