package br.edu.ifsp.campominado.entidades;

public class Partida {
    private String dificuldade;
    private int pontuacao;

    public Partida(String dificuldade, int pontuacao) {
        this.dificuldade = dificuldade;
        this.pontuacao = pontuacao;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
