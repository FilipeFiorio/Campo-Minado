package br.edu.ifsp.campominado.entidades;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Classificacao {

    private List<Jogador> jogadores; 
    private static final String ARQUIVO = "highscore.txt"; 

    public Classificacao() {
        this.jogadores = new ArrayList<>();
        carregarPontuacoes();
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
        ordenar();
        salvarPontuacoes();
    }

    private void ordenar() {
        jogadores.sort(Comparator.comparingInt(Jogador::getPontuacao).reversed());
    }

    public void exibir() {
        System.out.println("---- Classificação dos Jogadores ----");
        for (int i = 0; i < jogadores.size(); i++) {
            Jogador jogador = jogadores.get(i);
            System.out.printf("%dº - %s: %d pontos%n", i + 1, jogador.getNome(), jogador.getPontuacao());
        }
        System.out.println("-------------------------------------");
    }

    public List<Jogador> getJogadores() {
        return Collections.unmodifiableList(jogadores);
    }
    private void carregarPontuacoes() {
        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                String nome = dados[0];
                int pontuacao = Integer.parseInt(dados[1]);
                jogadores.add(new Jogador(nome, pontuacao));
            }
            ordenar(); 
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de pontuações não encontrado. Criando um novo...");
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de pontuações: " + e.getMessage());
        }
    }

    private void salvarPontuacoes() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (Jogador jogador : jogadores) {
                bw.write(jogador.getNome() + "," + jogador.getPontuacao());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar as pontuações: " + e.getMessage());
        }
    }
}
