package br.uel.ex1;

public class Ex1 {

	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < args.length; j++) {
				System.out.printf("%s ", args[j]);
			}
			System.out.println();
		}
	}
}
