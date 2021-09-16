package uel.br.rectangle;

public class Teste {

	public static void main(String[] args) {
		Rectangle retangulo1 = new Rectangle();
		System.out.println(retangulo1.calculaArea());
		System.out.println(retangulo1.calculaPerimetro());
		System.out.println(retangulo1.getLength());
		System.out.println(retangulo1.getWidth());
		retangulo1.setLength(10);
		retangulo1.setWidth(12);
		System.out.println(retangulo1.calculaArea());
		System.out.println(retangulo1.calculaPerimetro());
		System.out.println(retangulo1.getLength());
		System.out.println(retangulo1.getWidth());
	}

}
