package br.uel.decorator;

public abstract class SucoDecorator implements Suco {

	Suco suco;
	
	public SucoDecorator(Suco suco){
		this.suco = suco;
	}
	
	public Suco getSuco() {
		return this.suco;
	}
	
	public abstract String getNome();
	
	public abstract double getPreco();
	
	

}
