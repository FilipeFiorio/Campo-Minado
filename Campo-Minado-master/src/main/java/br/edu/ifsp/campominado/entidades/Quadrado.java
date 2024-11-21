package br.edu.ifsp.campominado.entidades;

public class Quadrado {
    private boolean temMina;
    private boolean revelado;
    private int numeroVizinhos;

    public Quadrado(boolean temMina, int numeroVizinhos) {
        this.temMina = temMina;
        this.revelado = false;
        this.numeroVizinhos = numeroVizinhos;
    }

    public boolean isTemMina() {
        return temMina;
    }

    public void setTemMina(boolean temMina) {
        this.temMina = temMina;
    }

    public boolean isRevelado() {
        return revelado;
    }

    public void setRevelado(boolean revelado) {
        this.revelado = revelado;
    }

    public int getNumeroVizinhos() {
        return numeroVizinhos;
    }

    public void setNumeroVizinhos(int numeroVizinhos) {
        this.numeroVizinhos = numeroVizinhos;
    }
}

