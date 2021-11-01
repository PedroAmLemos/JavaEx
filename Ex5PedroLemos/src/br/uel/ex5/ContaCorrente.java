package br.uel.ex5;

import java.math.BigDecimal;

public class ContaCorrente extends ContaBancaria {
	private BigDecimal limite;

	public ContaCorrente(String cliente, String numeroConta, BigDecimal saldo, BigDecimal limite) {
		super(cliente, numeroConta, saldo);
		this.limite = limite;
	}	

	public BigDecimal getLimite() {
		return limite;
	}

	public void setLimite(BigDecimal limite) {
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
	

}
