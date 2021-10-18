import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        LinkedList<ContaBancaria>contasBancarias = new LinkedList<>();
        int opcao, tipoContaBancaria, diaRendimento;
        Scanner input = new Scanner(System.in);
        String numeroConta, nome;
        BigDecimal saldo, limite, saque, taxa, valor, tributos, taxaRendimento, taxaAdm;
        do{
            System.out.println("Insira uma opção");
            System.out.println("(1) Cadastrar uma conta");
            System.out.println("(2) Sacar um valor da conta");
            System.out.println("(3) Atualizar uma conta poupança com o seu rendimento");
            System.out.println("(4) Depositar um valor na conta");
            System.out.println("(5) Mostrar saldo de uma conta");
            System.out.println("(6) Calcular os tributos de uma conta");
            System.out.println("(7) Calcular a taxa de administração e uma conta investimento");
            System.out.println("(8) Sair");
            opcao = Integer.parseInt(input.nextLine());
            switch(opcao){
                case 1 ->{
                    System.out.println("Insira o nome do cliente: ");
                    nome = input.nextLine();

                    System.out.println("Insira o numero da conta: ");
                    numeroConta = input.nextLine();

                    System.out.println("Insira o saldo");
                    saldo = new BigDecimal(input.nextLine());

                    System.out.println("Insira o tipo de conta: ");
                    System.out.println("(1) Conta Corrente");
                    System.out.println("(2) Conta Poupança");
                    System.out.println("(3) Conta Investimento");
                    tipoContaBancaria = Integer.parseInt(input.nextLine());

                    switch (tipoContaBancaria) {
                        case 1 -> {
                            System.out.println("Insira o limite da conta corrente: ");
                            limite = new BigDecimal(input.nextLine());
                            ContaCorrente novaContaCorrente = new ContaCorrente(nome, numeroConta, saldo, limite);
                            contasBancarias.add(novaContaCorrente);
                        }
                        case 2 -> {
                            System.out.println("Insira o rendimento dia da conta corrente: ");
                            diaRendimento = Integer.parseInt(input.nextLine());
                            ContaPoupanca novaContaPoupanca = new ContaPoupanca(nome, numeroConta, saldo, diaRendimento);
                            contasBancarias.add(novaContaPoupanca);
                        }
                        case 3 -> {
                            ContaInvestimento novaContaInvestimento = new ContaInvestimento(nome, numeroConta, saldo);
                            contasBancarias.add(novaContaInvestimento);
                        }
                        default -> {
                            System.out.println("Opção inválida");
                        }
                    }
                }
                case 2 ->{
                    System.out.println("Insira o numero da conta para saque: ");
                    numeroConta = input.nextLine();
                    int flag = 0;
                    for(ContaBancaria conta : contasBancarias){
                        if(conta.getNumeroConta().compareTo(numeroConta) == 0){
                            System.out.println("Insira o valor do saque: ");
                            saque = new BigDecimal(input.nextLine());
                            conta.sacar(saque);
                            flag = 1;
                            break;
                        }
                    }
                    if(flag == 0){
                        System.out.println("Numero de conta não encontrado");
                    }
                }
                case 3 ->{
                    System.out.println("Insira o numero da conta poupança para atualização: ");
                    numeroConta = input.nextLine();
                    System.out.println("Insira a taxa de rendimento (em porcentagem)");
                    taxa = new BigDecimal(input.nextLine());
                    int flag = 0;
                    for(ContaBancaria conta : contasBancarias){
                        if(conta.getNumeroConta().compareTo(numeroConta) == 0){
                            if(conta instanceof ContaPoupanca){
                                ((ContaPoupanca) conta).calcularNovoSaldo(taxa);
                                System.out.println("O novo saldo é: " + conta.getSaldo());

                            }else{
                                System.out.println("A conta informada não é do tipo poupança");
                            }
                            flag = 1;
                            break;
                        }
                    }
                    if(flag == 0){
                        System.out.println("Numero de conta não encontrado");
                    }
                }
                case 4 ->{
                    System.out.println("Insira o número da conta para o depósito:");
                    numeroConta = input.nextLine();
                    System.out.println("Insira o valor para depósito:");
                    valor = new BigDecimal(input.nextLine());
                    int flag = 0;
                    for(ContaBancaria conta : contasBancarias){
                        if(conta.getNumeroConta().compareTo(numeroConta) == 0){
                            conta.depositar(valor);
                            flag = 1;
                            break;
                        }
                    }
                    if(flag == 0){
                        System.out.println("Numero de conta não encontrado");
                    }
                }
                case 5 ->{
                    System.out.println("Insira o numero da conta para ver o saldo");
                    numeroConta = input.nextLine();
                    int flag = 0;
                    for(ContaBancaria conta : contasBancarias){
                        if(conta.getNumeroConta().compareTo(numeroConta) == 0){
                            System.out.println("O saldo é: " + conta.getSaldo());
                            flag = 1;
                            break;
                        }
                    }
                    if(flag == 0){
                        System.out.println("Numero de conta não encontrado");
                    }
                }
                case 6 ->{
                    System.out.println("Insira o número da conta para calcular os tributos: ");
                    numeroConta = input.nextLine();
                    System.out.println("Insira a taxa de rendimento");
                    taxaRendimento = new BigDecimal(input.nextLine());
                    int flag = 0;
                    for(ContaBancaria conta : contasBancarias){
                        if(conta.getNumeroConta().compareTo(numeroConta) == 0){
                            flag = 1;
                            if(conta instanceof ContaInvestimento){
                                tributos = ((ContaInvestimento) conta).calcularTributo(taxaRendimento);
                                System.out.println("Tributos: " + tributos);
                            }else{
                                System.out.println("Conta inserida não é do tipo investimento");
                            }
                        }
                    }
                    if(flag == 0){
                        System.out.println("Numero de conta não encontrado");
                    }
                }
                case 7 ->{
                    System.out.println("Insira o número da conta para calcular a taxa de administração: ");
                    numeroConta = input.nextLine();
                    System.out.println("Insira a taxa de rendimento em porcentagem");
                    taxaRendimento = new BigDecimal(input.nextLine());
                    int flag = 0;
                    for(ContaBancaria conta : contasBancarias){
                        if(conta.getNumeroConta().compareTo(numeroConta) == 0){
                            flag = 1;
                            if(conta instanceof ContaInvestimento){
                                taxaAdm = ((ContaInvestimento) conta).calcularTaxaAdministracao(taxaRendimento);
                                System.out.println("Taxa de administração: " + taxaAdm);
                            }else{
                                System.out.println("Conta inserida não é do tipo investimento");
                            }
                        }
                    }
                    if(flag == 0){
                        System.out.println("Numero de conta não encontrado");
                    }
                }
            }
        }while(opcao != 8);

    }
}
