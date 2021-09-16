package br.uel.ex2;

public class Ex2 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < args.length; j++) {
				System.out.printf("%s ", args[j]);
			}
			System.out.println();
		}


	}

}
