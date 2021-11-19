package br.uel.adapter;

public class ControleDePontoAdapter extends ControleDePonto{
	private ControleDePontoNovo controleDePontoNovo;
	public ControleDePontoAdapter(){
		controleDePontoNovo = new ControleDePontoNovo();
	}
	public void registrarEntrada(Funcionario f) {
		this.controleDePontoNovo.registrar(f, true);	
		
	}
	public void registrarSaida(Funcionario f) {
		this.controleDePontoNovo.registrar(f, false);
		
	}
}
