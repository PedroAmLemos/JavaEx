package br.uel.atendimento;

import java.util.Scanner;

public class Atendimento {

	public static void main(String[] args) {
		
		Fila fila = new Fila();
		Scanner input = new Scanner(System.in);
		int option;
		
		do {
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("Escolha uma opção (0 para sair): ");
			System.out.println("(1): Entrar na fila");
			System.out.println("(2): Desistir na fila");
			System.out.println("(3): Atender cliente");
			System.out.println("(4): Buscar posição na fila");
			System.out.println("(5): Imprimir fila");
			option = input.nextInt();
			input.nextLine();
			if(option == 1) {
				System.out.println("Insira o nome: ");
				String nome = input.nextLine();
				fila.entrarFila(nome);
			}
			else if(option == 2) {
				System.out.println("Insira o nome do desistente: ");
				String nome1 = input.nextLine();
				fila.desistirFila(nome1);
			}
			else if(option == 3) { 
				fila.atenderCliente();
			}
			else if(option == 4) {
				System.out.println("Insira o nome do cliente que deseja saber a posição: ");
				String nome2 = input.nextLine();
				System.out.println("O cliente "+nome2+" esta na posição "+fila.buscarPosicao(nome2) + 1);
			}
			else if(option == 5){
				fila.imprimirFIla();
			}
			System.out.printf("%n%n%n");
			
		} while(option != 0); 		
		input.close();
	}

}
