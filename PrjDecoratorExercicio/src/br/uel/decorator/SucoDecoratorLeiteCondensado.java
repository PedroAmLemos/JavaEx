package br.uel.decorator;

public class SucoDecoratorLeiteCondensado extends SucoDecorator {
	
	public SucoDecoratorLeiteCondensado(Suco suco){
		super(suco);
	}

	@Override
	public String getNome() {
		String nomeFinal = 
				this.getSuco().getNome()+" com leite condensado";
		return nomeFinal;
	}

	@Override
	public double getPreco() {
		double precoFinal = 
				this.getSuco().getPreco()+2;
		return precoFinal;
	}

}
