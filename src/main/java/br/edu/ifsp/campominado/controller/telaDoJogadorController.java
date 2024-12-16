package br.edu.ifsp.campominado.controller;

import br.edu.ifsp.campominado.entidades.GameData;
import br.edu.ifsp.campominado.entidades.Jogador;
import br.edu.ifsp.campominado.entidades.Partida;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import br.edu.ifsp.campominado.app2.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.application.Platform;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class telaDoJogadorController {

    private static final String ARQUIVO_JOGADOR = "jogador.json";

    @FXML
    private Button botaoSairDoJogo;

    @FXML
    private TextField caixaDeTexto;

    private Jogador jogadorAtual;

    @FXML
    void InserirNomeDeUsuario(ActionEvent event) throws IOException {
        String nomeUsuario = caixaDeTexto.getText().trim();

        if (nomeUsuario.isEmpty()) {
            System.out.println("O nome do usuário não pode estar vazio.");
            return;
        }

        carregarDadosDoJogador();

        if (jogadorAtual == null || !jogadorAtual.getNome().equals(nomeUsuario)) {
            jogadorAtual = new Jogador(nomeUsuario, new ArrayList<>());
        }

        adicionarNovaPartida("Média", GameData.getPontuacao() );

        salvarDadosDoJogador();

        App.setRoot("primary");
    }

    @FXML
    void sairDoJogo(ActionEvent event) {
        Platform.exit();
    }

    private void carregarDadosDoJogador() {
        File arquivo = new File(ARQUIVO_JOGADOR);
        if (arquivo.exists()) {
            try (Reader reader = new FileReader(ARQUIVO_JOGADOR)) {
                Gson gson = new Gson();
                Type tipoJogador = new TypeToken<Jogador>() {}.getType();
                jogadorAtual = gson.fromJson(reader, tipoJogador);
            } catch (IOException e) {
                System.out.println("Erro ao carregar os dados do jogador: " + e.getMessage());
            }
        }
    }

    private void salvarDadosDoJogador() {
        try (Writer writer = new FileWriter(ARQUIVO_JOGADOR)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(jogadorAtual, writer);
            System.out.println("Dados do jogador salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados do jogador: " + e.getMessage());
        }
    }

    private void adicionarNovaPartida(String dificuldade, int pontuacao) {
        if (jogadorAtual != null) {
            jogadorAtual.getPartidas().add(new Partida(dificuldade, pontuacao));
        }
    }
}
