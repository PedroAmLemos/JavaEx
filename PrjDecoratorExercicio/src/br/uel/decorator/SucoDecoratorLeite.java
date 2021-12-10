package br.uel.decorator;

public class SucoDecoratorLeite extends SucoDecorator {
	
	public SucoDecoratorLeite(Suco suco){
		super(suco);
	}

	@Override
	public String getNome() {
		String nomeCompleto = 
				this.getSuco().getNome()+" com leite";
		return nomeCompleto;
	}

	@Override
	public double getPreco() {
		double precoFinal = 
				this.getSuco().getPreco()+1;
		return precoFinal;
	}

	

}
