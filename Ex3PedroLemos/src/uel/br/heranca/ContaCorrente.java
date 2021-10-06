package uel.br.heranca;

import java.math.BigDecimal;

public class ContaCorrente extends ContaBancaria{

    private BigDecimal limite;

    public BigDecimal getLimite() {
        return limite;
    }

    public ContaCorrente(String cliente, String numeroConta, BigDecimal saldo, BigDecimal limite){
        super.cliente = cliente;
        super.numeroConta = numeroConta;
        super.saldo = saldo;
        this.limite = limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

    public void sacar(BigDecimal valor) {
        if(this.saldo.subtract(valor).abs().compareTo(limite) > 0){
            System.out.println("O saque solicitado ultrapassa o limite, operação cancelada...");
        }else{
            this.saldo = saldo.subtract(valor);
            System.out.println("Foram sacados R$ " + valor);
        }
    }

}