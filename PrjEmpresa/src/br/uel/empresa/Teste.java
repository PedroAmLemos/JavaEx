package br.uel.empresa;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Gerente gerente1 = new Gerente("Carlos", 10);
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		int op;
		
		do {
			System.out.println("Digite (1) para adicionar um novo gerente");
			System.out.println("Digite (2) para alterar o salário");
			System.out.println("Digite (3) sair");
			op = input.nextInt();
			if(op == 3) {
				flag = false;
				break;
			}
			else if (op == 1) {
				System.out.println("Digite um nome para o gerente");
				System.out.println("Digite o salário do gerente");
			}

		}while(flag);
		
		
		
		
		
		
		System.out.println("Nome: "+gerente1.getNome());
		System.out.println("Salário: "+gerente1.getSalario());

		gerente1.aumentarSalario();
		System.out.println("Aumentando o salário com taxa padrão...");
		System.out.println("Nome: "+gerente1.getNome());
		System.out.println("Salário: "+gerente1.getSalario());

		gerente1.aumentarSalario(25);
		System.out.println("Aumentando o salário com 25%...");
		System.out.println("Nome: "+gerente1.getNome());
		System.out.println("Salário: "+gerente1.getSalario());
		
		input.close();

	}

}
