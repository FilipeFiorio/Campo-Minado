package br.edu.ifsp.campominado.controller;

import br.edu.ifsp.campominado.entidades.Constantes;

import br.edu.ifsp.campominado.entidades.Jogador;
import com.google.gson.Gson;
import br.edu.ifsp.campominado.app2.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SecondaryController {

    @FXML
    private Button backToPrimary;

    @FXML
    private ListView<String> lista;

    @FXML
    void goToPrimary(ActionEvent event) throws IOException {
        App.setRoot("primary");
    }

    public Jogador lerJogadorDoArquivo() {
        Gson gson = new Gson();
        try (BufferedReader reader = new BufferedReader(new FileReader(Constantes.ARQUIVO_JOGADOR))) {
            return gson.fromJson(reader, Jogador.class);
        } catch (IOException e) {
            System.out.println("Erro ao ler os dados do jogador: " + e.getMessage());
            return null;
        }
    }

    public void carregarDadosJogador() {
        Jogador jogador = lerJogadorDoArquivo();
        if (jogador != null) {
            lista.getItems().clear();
            lista.getItems().add("Nome: " + jogador.getNome());
            lista.getItems().add("Pontuação: " + jogador.getPontuacao());
            lista.getItems().add("Dificuldade: " + jogador.getDificuldade());
        } else {
            lista.getItems().add("Nenhum dado encontrado.");
        }
    }

    @FXML
    void initialize() {
        carregarDadosJogador();
    }
}
