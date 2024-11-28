package br.edu.ifsp.campominado.entidades;

public class Jogador {

    private String nome; 
    private Pontuacao pontuacao;  

    public Jogador(String nome) {
        this.nome = nome;
        this.pontuacao = new Pontuacao();
    }
    public String getNome(){
        return nome;
    }
    public int getPontuacao(){
        return pontuacao.getPontos();
    }
    public void adicionarPontos(int pontos){
        pontuacao.adicionarPontos(pontos);
    }
    public void reiniciarPontuacao(){
        pontuacao.reiniciar();
    }
    public void iniciarCombo(){
        pontuacao.iniciarCombo();
    }
    public void atualizarCombo(){
        pontuacao.atualizarTempoCombo();
    }
    public void exibirInfo(){
        System.out.println("Informacoes do jogador");
        System.out.println("Nome: " + nome);
        System.out.println("Pontuacao" + getPontuacao());
    }
    
}

