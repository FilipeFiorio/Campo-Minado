package br.edu.ifsp.campominado.entidades;

public class GameData {

    private static int pontuacao;
    
    public static int getPontuacao() {
        return pontuacao;
    }
    
    public static void setPontuacao(int pontuacao) {
        GameData.pontuacao = pontuacao;
    }
    
}
