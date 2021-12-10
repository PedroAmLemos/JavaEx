package be.uel.set;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Set<String>nomes = new HashSet<String>();
		Scanner input = new Scanner(System.in);
		String nome;
		for(int i = 0; i < 9; i ++) {
			nome = input.nextLine();
			nomes.add(nome);
			
		}
		input.close();
	}

}
