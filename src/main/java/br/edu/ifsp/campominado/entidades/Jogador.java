package br.edu.ifsp.campominado.entidades;

import com.google.gson.annotations.Expose;

public class Jogador {

    @Expose
    private String nome;

    @Expose
    private int pontuacao;

    @Expose
    private String dificuldade;

    public Jogador(String nome, int pontuacao, String dificuldade) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.dificuldade = dificuldade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }
}
