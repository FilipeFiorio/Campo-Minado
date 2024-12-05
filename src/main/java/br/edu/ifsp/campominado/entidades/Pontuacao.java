package br.edu.ifsp.campominado.entidades;

public class Pontuacao {
    private int pontos;
    private int multiplicador; 
    private int tempoCombo; 
    public Pontuacao() {
        this.pontos = 0;
        this.multiplicador = 1;
        this.tempoCombo = 0;
    }

    public void adicionarPontos(int pontosBase) {
        this.pontos += pontosBase * this.multiplicador;
        System.out.println("Pontos adicionados: " + (pontosBase * this.multiplicador));
        System.out.println("Pontuação atual: " + this.pontos);
    }
    public void iniciarCombo() {
        this.multiplicador++;
        this.tempoCombo = 5; 
        System.out.println("Combo iniciado! Multiplicador atual: " + this.multiplicador);
    }

    public void finalizarCombo() {
        if (this.tempoCombo <= 0) {
            this.multiplicador = 1;
            System.out.println("Combo finalizado. Multiplicador resetado.");
        }
    }

    public void atualizarTempoCombo() {
        if (this.tempoCombo > 0) {
            this.tempoCombo--;
            System.out.println("Tempo restante para o combo: " + this.tempoCombo + " segundos");
        } else {
            finalizarCombo();
        }
    }

    public int getPontos() {
        return this.pontos;
    }
    public void reiniciar() {
        this.pontos = 0;
        this.multiplicador = 1;
        this.tempoCombo = 0;
    } 

}
