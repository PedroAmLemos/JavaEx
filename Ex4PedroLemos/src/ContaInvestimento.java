import java.math.BigDecimal;
import java.util.Scanner;

public class ContaInvestimento implements ContaBancaria, Tributavel{
    private String cliente;
    private String numeroConta;
    private BigDecimal saldo;

    public ContaInvestimento(String cliente, String numeroConta, BigDecimal saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
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
    public void depositar(BigDecimal valor) { saldo = saldo.add(valor); }

    @Override
    public BigDecimal calcularTributo(BigDecimal taxaRendimento) {
        return saldo.multiply(taxaRendimento).multiply(BigDecimal.valueOf(0.05)).divide(BigDecimal.valueOf(100));

    }

    public void calcularNovoSaldo(BigDecimal taxaRendimento){
        saldo = saldo.multiply(taxaRendimento).add(saldo).divide(BigDecimal.valueOf(100));
    }

    public BigDecimal calcularTaxaAdministracao(BigDecimal taxaRendimento){
        return saldo.multiply(taxaRendimento).divide(BigDecimal.valueOf(10000));
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
}
