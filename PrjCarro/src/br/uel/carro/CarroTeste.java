package br.uel.carro;

import java.util.Scanner;

public class CarroTeste {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Carro myCarro = new Carro();

		System.out.println("Insira a marca do carro");
		String marca = input.nextLine();
		myCarro.setMarca(marca);

		System.out.println("Insira o modelo do carro");
		String modelo = input.nextLine();
		myCarro.setModelo(modelo);

		System.out.println("Insira a velocidade do carro");
		int vel = input.nextInt();
		int marcha = myCarro.getMarcha(vel);

		System.out.printf(
				"A marca do carro é %s%nO modelo do carro é %s%nA velocidade é %d e a marcha que deve ser usada é %d%n",
				myCarro.getMarca(), myCarro.getModelo(), vel, marcha);

		input.close();

	}

}
