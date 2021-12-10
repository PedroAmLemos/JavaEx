package br.uel.decorator;

public class SucoDecoratorVodka extends SucoDecorator{
	
	public SucoDecoratorVodka(Suco suco) {
		super(suco);
	}
	
	public String getNome() {
		String nome = 
				this.getSuco().getNome()+" com vodka ";
		return nome;
	}
	
	public double getPreco() {
		double preco = 
				this.getSuco().getPreco()+10;
		return preco;
		
	}

}
