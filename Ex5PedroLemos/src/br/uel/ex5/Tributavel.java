package br.uel.ex5;

import java.math.BigDecimal;

public abstract class Tributavel extends ContaBancaria{

	public Tributavel(String cliente, String numeroConta, BigDecimal saldo) {
		super(cliente, numeroConta, saldo);
	}
	
	public BigDecimal calcularTributo(BigDecimal taxaRendimento) {
        return saldo.multiply(taxaRendimento).multiply(BigDecimal.valueOf(0.05)).divide(BigDecimal.valueOf(100));
	}
}
