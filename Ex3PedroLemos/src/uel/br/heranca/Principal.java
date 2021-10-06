package uel.br.heranca;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<ContaBancaria> contasBancarias = new LinkedList<>();
        LinkedList<String> numClientes = new LinkedList<>();
        int option;
        String cliente;
        String numeroConta;
        BigDecimal deposito;
        BigDecimal saldo;
        BigDecimal limite;
        BigDecimal saque;
        BigDecimal taxa;
        do{
            System.out.println("Escolha uma opção: ");
            System.out.println("(1) Cadastrar uma conta");
            System.out.println("(2) Sacar um valor da conta");
            System.out.println("(3) Atualizar uma conta poupança com o rendimento");
            System.out.println("(4) Depositar um valor na conta");
            System.out.println("(5) Mostrar saldo da conta");
            System.out.println("(6) Sair");

            option = Integer.parseInt(input.nextLine());

            switch (option) {
                case 1 -> {
                    System.out.println("Insira (1) para conta corrente e (2) para conta poupança ");
                    option = Integer.parseInt(input.nextLine());
                    System.out.println("Insira o nome do cliente: ");
                    cliente = input.nextLine();
                    System.out.println("Insira o numero da conta: ");
                    numeroConta = input.nextLine();
                    System.out.println("Insira o saldo atual: ");
                    saldo = BigDecimal.valueOf(Double.parseDouble(input.nextLine()));
                    numClientes.add(numeroConta);
                    switch (option) {
                        case 1 -> {
                            System.out.println("Insira o limite: ");
                            limite = BigDecimal.valueOf(Double.parseDouble(input.nextLine()));
                            ContaCorrente novaCorrente = new ContaCorrente(cliente, numeroConta, saldo, limite);
                            contasBancarias.add(novaCorrente);
                        }
                        case 2 -> {
                            ContaPoupanca novaPoupanca = new ContaPoupanca(cliente, numeroConta, saldo);
                            contasBancarias.add(novaPoupanca);
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Insira (1) para conta corrente e (2) para conta poupança");
                    option = Integer.parseInt(input.nextLine());
                    System.out.println("Insira o número da conta");
                    numeroConta = input.nextLine();
                    System.out.println("Insira o valor que deseja sacar");
                    saque = BigDecimal.valueOf(Double.parseDouble(input.nextLine()));
                    int index = numClientes.indexOf(numeroConta);
                    if (index == -1) {
                        System.out.println("Conta não encontrada");
                    }else {
                        switch (option) {
                            case 1 -> {
                                ContaCorrente contaCorrente = (ContaCorrente) contasBancarias.get(index);
                                contaCorrente.sacar(saque);
                            }
                            case 2 -> {
                                ContaPoupanca contaPoupanca = (ContaPoupanca) contasBancarias.get(index);
                                contaPoupanca.sacar(saque);
                            }
                        }

                    }
                }
                case 3 -> {
                    System.out.println("Insira o numero da conta");
                    numeroConta = input.nextLine();
                    System.out.println("Insira a taxa");
                    taxa = BigDecimal.valueOf(Double.parseDouble(input.nextLine()));
                    int index = numClientes.indexOf(numeroConta);
                    if(index == -1){
                        System.out.println("Conta nao encontrada");
                    }else{
                        ContaPoupanca contaPoupanca = (ContaPoupanca) contasBancarias.get(index);
                        contaPoupanca.calcularNovoSaldo(taxa);
                    }
                }
                case 4 -> {
                    System.out.println("Deposito");
                    System.out.println("Insira (1) para conta corrente e (2) para conta poupança ");
                    option = Integer.parseInt(input.nextLine());
                    System.out.println("Insira o numero da conta");
                    numeroConta = input.nextLine();
                    System.out.println("Insira o valor de depósito");
                    deposito = BigDecimal.valueOf(Double.parseDouble(input.nextLine()));
                    int index = numClientes.indexOf(numeroConta);
                    if(index == -1){
                        System.out.println("Conta não encontradas");
                    }else{
                        switch (option) {
                            case 1 -> {
                                ContaCorrente contaCorrente = (ContaCorrente) contasBancarias.get(index);
                                contaCorrente.depositar(deposito);
                            }
                            case 2 -> {
                                ContaPoupanca contaPoupanca = (ContaPoupanca) contasBancarias.get(index);
                                contaPoupanca.depositar(deposito);
                            }
                        }
                    }


                }
                case 5 -> {
                    System.out.println("Insira (1) para conta corrente e (2) para conta poupança ");
                    option = Integer.parseInt(input.nextLine());
                    System.out.println("Insira o numero da conta");
                    numeroConta = input.nextLine();
                    int index = numClientes.indexOf(numeroConta);
                    if(index == -1){
                        System.out.println("Conta não encontrada");
                    }else{
                        switch (option) {
                            case 1 -> {
                                ContaCorrente contaCorrente = (ContaCorrente) contasBancarias.get(index);
                                System.out.println("Saldo da conta: " + contaCorrente.getSaldo());
                            }
                            case 2 -> {
                                ContaPoupanca contaPoupanca = (ContaPoupanca) contasBancarias.get(index);
                                System.out.println("Saldo da conta: " + contaPoupanca.getSaldo());
                            }
                        }
                    }
                }
            }
        }while(option != 6);
        input.close();
    }
}
