package uel.br.heranca;

import java.math.BigDecimal;

public class ContaBancaria {
    protected String cliente;
    protected String numeroConta;
    protected BigDecimal saldo;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void sacar(BigDecimal valor){
        if(this.saldo.subtract(valor).compareTo(BigDecimal.ZERO) > 0){
            System.out.println("Saldo negativo, operação não efetuada...");
        }else{
            this.saldo = saldo.subtract(valor);
            System.out.println("Foram sacados R$ " + valor + " da conta");
        }
    }

    public void depositar(BigDecimal valor){
        this.saldo = saldo.add(valor);
        System.out.println("Foram depositados R$ " + valor + " na conta");
    }
}
