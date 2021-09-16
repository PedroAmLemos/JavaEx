package br.uel.soma;

public class Soma {

	public static void main(String[] args) {
		int soma = 0;
		for(String string : args) {
			soma += Integer.parseInt(string);
		}
		System.out.println(soma);

	}

}
