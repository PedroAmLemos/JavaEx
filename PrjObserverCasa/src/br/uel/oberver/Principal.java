package br.uel.oberver;

public class Principal {

	public static void main(String[] args) {
		Casa casa = new Casa();
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Carlos");
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Rubens");
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Fred");
		casa.attach(pessoa1);
		casa.attach(pessoa2);
		casa.attach(pessoa3);
		casa.abrirPorta();
		

	}

}
