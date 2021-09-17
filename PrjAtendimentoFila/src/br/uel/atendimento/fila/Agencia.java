package br.uel.atendimento.fila;

import java.util.ArrayList;
import java.util.Scanner;

public class Agencia {
    private int numero, ultimoAtendido;
    private final ArrayList<Cliente> fila;
    private final ArrayList<Cliente> filaPreferencial;

    public Agencia(int numeroAgencia) {
        fila = new ArrayList<>();
        filaPreferencial = new ArrayList<>();
        this.numero = numeroAgencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente cadastroCliente() {
        Scanner cadastro = new Scanner(System.in);
        System.out.println("Iniciando cadastro de cliente: ");
        System.out.print("\tInsira o nome: ");
        String nome = cadastro.nextLine();
        System.out.print("\tInsira a hora de chegada: ");
        String hora = cadastro.nextLine();
        System.out.print("\tInsira a idade: ");
        int idade = Integer.parseInt(cadastro.nextLine());
        System.out.print("\tInsira o serviço a ser realizado: ");
        String servico = cadastro.nextLine();
        return new Cliente(nome, hora, servico, idade);
    }

    public void addCliente(Cliente cliente){
        if(cliente.getIdade() > 65){
            this.filaPreferencial.add(cliente);
            System.out.println("Cliente colocado na lista preferencial");
        }else{
            this.fila.add(cliente);
        }
    }

    public void entrarFila(){
        addCliente(cadastroCliente());
    }

    public void desistirFila() {
        Scanner clienteRemover = new Scanner(System.in);
        System.out.println("Insira o nome do cliente que será removido: ");
        String nome = clienteRemover.nextLine();
        int flag = 0;
        System.out.println("Digite 1 para fila e 2 para fila preferencial");
        int fila = Integer.parseInt(clienteRemover.nextLine());
        if(fila == 1){
            for(Cliente cliente : this.fila) {
                if(nome.equals(cliente.getNome())){
                    flag = 1;
                    this.fila.remove(cliente);
                    break;
                }
            }
        }
        else if(fila == 0){
            for(Cliente preferencial: this.filaPreferencial){
                if(nome.equals(preferencial.getNome())){
                    flag = 1;
                    this.fila.remove(preferencial);
                    break;
                }
            }
        }
        if(flag == 0){
            System.out.println("O cliente não foi encontrado no sistema");
        }
    }

    public void imprimirFila() {
        System.out.println("Fila:");
        for(int i = 0; i < this.fila.size(); i++){
            System.out.println(i+1 + ": " + this.fila.get(i).getNome());
        }
        System.out.println("\n\nFila preferencial:");
        for(int i = 0; i < this.filaPreferencial.size(); i++){
            System.out.println(i+1 + ": " + this.filaPreferencial.get(i).getNome());
        }
        System.out.println("\n");
    }

    public void atenderCliente(){
        if(this.filaPreferencial.size() > 0 && this.ultimoAtendido == 1){
            System.out.println("Atendendo " +this.filaPreferencial.get(0).getNome() +" da fila preferencial");
            this.filaPreferencial.remove(0);
            this.ultimoAtendido = 0;
        }
        else if(this.fila.size() > 0 && this.ultimoAtendido == 0){
            System.out.println("Atendendo " +this.fila.get(0).getNome() +" da fila");
            this.fila.remove(0);
            this.ultimoAtendido = 1;
        }
        else{
            System.out.println("Nenhum cliente cadastrado nas filas");
        }
    }

    public void buscarPosicao(){
        Scanner sc = new Scanner(System.in);
        int fila, flag = 0;
        System.out.println("Insira o nome do cliente para busca: ");
        String nome = sc.nextLine();
        System.out.println("Digite 1 para fila e 2 para fila preferencial");
        fila = Integer.parseInt(sc.nextLine());
        if(fila == 1){
            for(Cliente cliente : this.fila){
                if(nome.equals(cliente.getNome())){
                    flag = 1;
                    System.out.println("A posicao do cliente na fila é: " +(this.fila.indexOf(cliente)+1));
                }
            }
        }else if(fila == 0){
            for(Cliente cliente : this.filaPreferencial){
                if(nome.equals(cliente.getNome())){
                    flag = 1;
                    System.out.println("A posicao de" +nome +" na fila preferencial é: " +this.filaPreferencial.indexOf(cliente)+1);
                }
            }
        }
        if(flag == 0){
            System.out.println("Não foi encontrado cliente com o nome: " +nome);
        }
    }

    // TODO arrumar o remover pra receber qual a fila
    // TODO verificar as condições de if de atenderCLiente

}
