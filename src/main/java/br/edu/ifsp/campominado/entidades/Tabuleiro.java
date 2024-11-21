package br.edu.ifsp.campominado.entidades;

import java.util.ArrayList;

public class Tabuleiro {
    private ArrayList<ArrayList<Quadrado>> quadrados;
    private int tamanho;
    private int numeroBombas;

    public Tabuleiro(int tamanho, int numeroBombas) {
        this.tamanho = tamanho;
        this.numeroBombas = numeroBombas;
        this.quadrados = new ArrayList<>();

        for (int i = 0; i < tamanho; i++) {
            ArrayList<Quadrado> linha = new ArrayList<>();
            for (int j = 0; j < tamanho; j++) {
                linha.add(new Quadrado(false, 0));
            }
            quadrados.add(linha);
        }
    }
    public ArrayList<ArrayList<Quadrado>> getQuadrados() {
        return quadrados;
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getNumeroBombas() {
        return numeroBombas;
    }
}