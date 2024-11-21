package br.edu.ifsp.campominado.entidades;

public enum Dificuldade {
    FACIL(5, 60, 5),    
    MEDIA(8, 45, 15),   
    DIFICIL(10, 30, 25); 

    private final int tamanhoTabuleiro;
    private final int tempoLimite;
    private final int numeroBombas;


    Dificuldade(int tamanhoTabuleiro, int tempoLimite, int numeroBombas) {
        this.tamanhoTabuleiro = tamanhoTabuleiro;
        this.tempoLimite = tempoLimite;
        this.numeroBombas = numeroBombas;
    }

    
    public int getTamanhoTabuleiro() {
        return tamanhoTabuleiro;
    }

    public int getTempoLimite() {
        return tempoLimite;
    }

    public int getNumeroBombas() {
        return numeroBombas;
    }
}
