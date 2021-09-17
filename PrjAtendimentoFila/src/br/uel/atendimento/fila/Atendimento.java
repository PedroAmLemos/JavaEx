package br.uel.atendimento.fila;

import java.util.Scanner;

public class Atendimento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o numero da agencia: ");
        int numeroAgencia = Integer.parseInt(input.nextLine());
        Agencia agencia1 = new Agencia(numeroAgencia);
        boolean atendimento = true;
        int opcao;
        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("1) Entrar na fila");
            System.out.println("2) Desistir da fila");
            System.out.println("3) Atender cliente");
            System.out.println("4) Buscar posição na fila");
            System.out.println("5) Imprimir fila");
            opcao = Integer.parseInt(input.nextLine());
            switch (opcao) {
                case 1 -> agencia1.entrarFila();
                case 2 -> agencia1.desistirFila();
                case 3 -> agencia1.atenderCliente();
                case 4 -> agencia1.buscarPosicao();
                case 5 -> agencia1.imprimirFila();
                default -> atendimento = false;
            }
        }while(atendimento);
    }
}
