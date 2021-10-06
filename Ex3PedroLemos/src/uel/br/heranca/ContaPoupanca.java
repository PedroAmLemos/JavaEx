package uel.br.heranca;

import java.math.BigDecimal;

public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;

    public ContaPoupanca(String cliente, String numeroConta, BigDecimal saldo){
        super.cliente = cliente;
        super.numeroConta = numeroConta;
        super.saldo = saldo;
    }

    public void calcularNovoSaldo(BigDecimal taxaRendimento){
        this.saldo = saldo.add(saldo.multiply(taxaRendimento));
        System.out.println("Saldo atualizado para: R$ " + this.saldo);
    }
}
