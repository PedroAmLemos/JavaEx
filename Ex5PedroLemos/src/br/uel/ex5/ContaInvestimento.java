package br.uel.ex5;

import java.math.BigDecimal;

public class ContaInvestimento extends Tributavel{

	public ContaInvestimento(String cliente, String numeroConta, BigDecimal saldo) {
		super(cliente, numeroConta, saldo);
	}
    public void calcularNovoSaldo(BigDecimal taxaRendimento){
        saldo = saldo.multiply(taxaRendimento).add(saldo).divide(BigDecimal.valueOf(100));
    }

    public BigDecimal calcularTaxaAdministracao(BigDecimal taxaRendimento){
        return saldo.multiply(taxaRendimento).divide(BigDecimal.valueOf(10000));
    }
}
