package br.uel.ex3;
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		String name;
		int n;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your name: ");
		name = input.nextLine();

		System.out.print("Enter the amount of times you name will be printed: ");
		n = input.nextInt();

		for(int i = 0; i < n; i++) {
			System.out.printf("%s\n", name);
		}

		input.close();
	
	}

}
