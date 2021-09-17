package br.uel.atendimento.fila;

public class Cliente {
    private String nome;
    private String horaChegada;
    private String servico;
    private int idade;

    public Cliente(String nome, String horaChegada, String servico, int idade) {
        this.nome = nome;
        this.horaChegada = horaChegada;
        this.servico = servico;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(String horaChegada) {
        this.horaChegada = horaChegada;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
