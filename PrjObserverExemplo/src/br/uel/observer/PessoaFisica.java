package br.uel.observer;

public class PessoaFisica implements Observer {
	
	private String nome;
	
	private String cpf;
	
	public PessoaFisica(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}

	@Override
	public void notificarAlteracao(Subject subject) {
		System.out.println("Investidor "+this.nome+" (CPF: "+this.cpf+") sendo notificado");
		Acao acao = (Acao)subject;
		System.out.println("O novo pre�o da a��o "+acao.getCodigo()+" � "+acao.getValor());

	}

}
