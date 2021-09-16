package br.uel.product;

public class ProductClass {

	public static int product(int... numbers) {
		int total = 1;
		for(int number : numbers) {
			total *= number;
		}
		return total;
	}
	public static void main(String[] args) {
		System.out.println("1, 2, e 4: "+product(1,2,3,4));
		System.out.println("1, 2, 4 e 5: "+product(1,2,3,4, 5));
		System.out.println("1, 2, 4, 5 e 6: "+product(1,2,3,4, 5, 6));
		System.out.println("1, 2, 4, 5, 6 e 7: "+product(1,2,3,4, 5, 6, 7));

	}

}
