package br.edu.ifsp.campominado.entidades;

import java.util.List;

public class Jogador {
    private String nome;
    private List<Partida> partidas;

    public Jogador(String nome, List<Partida> partidas) {
        this.nome = nome;
        this.partidas = partidas;
    }

    public String getNome() {
        return nome;
    }

    public List<Partida> getPartidas() {
        return partidas;
    }
}
