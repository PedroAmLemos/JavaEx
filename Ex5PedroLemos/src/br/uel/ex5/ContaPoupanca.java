package br.uel.ex5;

import java.math.BigDecimal;

public class ContaPoupanca extends ContaBancaria{
	private int diaRendimento;

	public ContaPoupanca(String cliente, String numeroConta, BigDecimal saldo, int diaRendimento) {
		super(cliente, numeroConta, saldo);
		this.setDiaRendimento(diaRendimento);
		
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
    public void calcularNovoSaldo(BigDecimal taxa){
        saldo = saldo.multiply(taxa).divide(BigDecimal.valueOf(100)).add(saldo);
    }

}
