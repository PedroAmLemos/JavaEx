import java.math.BigDecimal;
import java.util.Scanner;

public class ContaPoupanca implements ContaBancaria{
    private String cliente;
    private String numeroConta;
    private BigDecimal saldo;
    private int diaRendimento;

    public ContaPoupanca(String cliente, String numeroConta, BigDecimal saldo, int diaRendimento) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.diaRendimento = diaRendimento;
    }

    @Override
    public void sacar(BigDecimal valor) {
        if(saldo.subtract(valor).compareTo(BigDecimal.ZERO) < 0){
            System.out.println("O valor de saque é maior que o saldo disponível!");
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
