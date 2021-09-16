package uel.br.ex.array;

import java.security.SecureRandom;

public class Teste {

	public static void main(String[] args) {

		SecureRandom random = new SecureRandom();
		int randomNumber; 
		int[] contagem = new int[6];
		for(int i = 0; i < 50; i++) {
			randomNumber = random.nextInt(700);
			if(randomNumber < 99) {
				contagem[0]++;
			}
			else if(randomNumber < 199) {
				contagem[1]++;
			}
			else if(randomNumber < 299) {
				contagem[2]++;
			}
			else if(randomNumber < 399) {
				contagem[3]++;
			}
			else if(randomNumber < 499) {
				contagem[4]++;
			}
			else {
				contagem[5]++;
			}
		}

		

	}

}
