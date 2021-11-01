package br.uel.ex5;

import java.math.BigDecimal;

public abstract class ContaBancaria {
    protected String cliente;
    protected String numeroConta;
    protected BigDecimal saldo;	
    
    public ContaBancaria(String cliente, String numeroConta, BigDecimal saldo) {
    	this.cliente = cliente;
    	this.numeroConta = numeroConta;
    	this.saldo = saldo;
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
	
	public void sacar(BigDecimal valor) {
        if(saldo.subtract(valor).compareTo(BigDecimal.ZERO) < 0){
            System.out.println("O valor de saque é maior que o saldo disponível!");
            System.out.println("Operação não efetuada...");
        }else{
            saldo = saldo.subtract(valor);
            System.out.println("O novo saldo é: " +saldo);
        }
	}
	
	public void depositar(BigDecimal valor){
		saldo = saldo.add(valor);
	}

}
