package br.edu.ifsp.campominado.entidades;

import java.util.ArrayList;
import java.util.Random;

public class Mina {
     
    public void posicionarBombas(Tabuleiro tabuleiro) {
        Random random = new Random();
        int bombasRestantes = tabuleiro.getNumeroBombas();
        int tamanho = tabuleiro.getTamanho();

        while (bombasRestantes > 0) {
            int x = random.nextInt(tamanho);
            int y = random.nextInt(tamanho);

            Quadrado quadrado = tabuleiro.getQuadrados().get(x).get(y);
            if (!quadrado.isTemMina()) {
                quadrado.setTemMina(true);
                bombasRestantes--;
            }
        }
    }

    public void exibirTabuleiro(Tabuleiro tabuleiro) {
        for (ArrayList<Quadrado> linha : tabuleiro.getQuadrados()) {
            for (Quadrado quadrado : linha) {
                if (quadrado.isTemMina()) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }
    
}