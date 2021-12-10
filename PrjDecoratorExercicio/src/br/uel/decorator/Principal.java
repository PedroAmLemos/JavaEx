package br.uel.decorator;

public class Principal {

	public static void main(String[] args) {
		
		Suco basico = new SucoBasico("morango", 5);
		
		System.out.println(basico.getNome());
		System.out.println(basico.getPreco());
		
		Suco comLeite = 
				new SucoDecoratorLeite(basico);
		System.out.println(comLeite.getNome());
		System.out.println(comLeite.getPreco());
		
		Suco comLeiteCondensado = new SucoDecoratorLeiteCondensado(basico);
		System.out.println(comLeiteCondensado.getNome());
		System.out.println(comLeiteCondensado.getPreco());
		
		Suco junkie = new SucoDecoratorLeiteCondensado(comLeiteCondensado);
		System.out.println(junkie.getNome());
		System.out.println(junkie.getPreco());
		
		Suco junkieComLeite = new SucoDecoratorLeite(junkie);
		System.out.println(junkieComLeite.getNome());
		System.out.println(junkieComLeite.getPreco());
		
		Suco vodka = new SucoDecoratorVodka(junkieComLeite);
		System.out.println(vodka.getNome());
		System.out.println(vodka.getPreco());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Suco leite = 
//				new SucoDecoratorLeite(basico);
//		
//		Suco condensado = 
//				new SucoDecoratorLeiteCondensado(leite);
//		
//		Suco condensado2 =
//				new SucoDecoratorLeiteCondensado(condensado);
//		
//		
//		System.out.println(condensado2.getNome());
//		System.out.println(condensado2.getPreco());
//		
//		
//		Suco sucoBasico = new SucoBasico("laranja", 5);
//		Suco sucoComLeite = new SucoDecoratorLeite(new SucoBasico("morango", 5));
//		Suco sucoComLeiteCondensado = new SucoDecoratorLeiteCondensado(new SucoBasico("limão", 5));
//		Suco sucoComposto = new SucoDecoratorLeiteCondensado(
//				new SucoDecoratorLeite(new SucoBasico("mamão", 5)));
//		
//		Suco sucoComposto2 = new SucoDecoratorLeiteCondensado(
//				new SucoDecoratorLeiteCondensado(
//						new SucoDecoratorLeite(
//								new SucoBasico("caju", 4))));
//		Suco sucoComposto3 = 
//				new SucoDecoratorLeite(sucoComposto2);
//		
//		
//		System.out.println(sucoBasico.getNome());
//		System.out.println(sucoBasico.getPreco());
//		
//		System.out.println("==========================");
//		
//		System.out.println(sucoComLeite.getNome());
//		System.out.println(sucoComLeite.getPreco());
//		
//		System.out.println("==========================");
//		
//		System.out.println(sucoComposto.getNome());
//		System.out.println(sucoComposto.getPreco());
//		
//		System.out.println("==========================");
//		
//		System.out.println(sucoComposto2.getNome());
//		System.out.println(sucoComposto2.getPreco());
//		
//		System.out.println("==========================");
//		
//		System.out.println(sucoComposto3.getNome());
//		System.out.println(sucoComposto3.getPreco());
		

	}

}
