import java.math.BigDecimal;
import java.util.Scanner;

public class ContaCorrente implements ContaBancaria{
    private String cliente;
    private String numeroConta;
    private BigDecimal saldo;
    private BigDecimal limite;

    public ContaCorrente(String cliente, String numeroConta, BigDecimal saldo, BigDecimal limite) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.limite = limite;
    }

    @Override
    public void sacar(BigDecimal valor) {
        if(saldo.add(limite).subtract(valor).compareTo(BigDecimal.ZERO) < 0){
            System.out.println("O valor de saque é maior que o limite disponível!");
            System.out.println("Operação não efetuada...");
        }else{
            saldo = saldo.subtract(valor);
            System.out.println("O novo saldo é: " +saldo);
        }
    }

    @Override
    public void depositar(BigDecimal valor) {
        saldo = saldo.add(valor);
    }

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

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

}
