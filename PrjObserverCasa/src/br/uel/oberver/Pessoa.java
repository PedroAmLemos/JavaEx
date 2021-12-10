package br.uel.oberver;

public class Pessoa implements Observer{
	private String nome;

	@Override
	public void update(Subject subject) {
		System.out.println("A porta foi aberta. Notificação para "+ this.nome);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
