package br.edu.ifsp.campominado.controller;

import br.edu.ifsp.campominado.app2.App;
import br.edu.ifsp.campominado.entidades.Jogador;
import br.edu.ifsp.campominado.entidades.Partida;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;

public class SecondaryController {

    private static final String ARQUIVO_JOGADOR = "jogador.json";

    @FXML
    private ListView<String> listaHighscores;

    @FXML
    private Button backToPrimary;

    @FXML
    void goToPrimary(ActionEvent event) throws IOException {
        App.setRoot( "primary" );
    }

    @FXML
    public void initialize() {
        carregarHighscores();
    }

    private void carregarHighscores() {
        File arquivo = new File(ARQUIVO_JOGADOR);

        if (arquivo.exists()) {
            try (FileReader reader = new FileReader(ARQUIVO_JOGADOR)) {
                Gson gson = new Gson();
                Type tipoJogador = new TypeToken<Jogador>() {}.getType();
                Jogador jogador = gson.fromJson(reader, tipoJogador);

                if (jogador != null) {
                    for (Partida partida : jogador.getPartidas()) {
                        String linha = String.format(
                            "Jogador: %s | Dificuldade: %s | Pontuação: %d",
                            jogador.getNome(), partida.getDificuldade(), partida.getPontuacao()
                        );
                        listaHighscores.getItems().add(linha);
                    }
                }
            } catch (IOException e) {
                System.out.println("Erro ao carregar os highscores: " + e.getMessage());
            }
        } else {
            listaHighscores.getItems().add("Nenhum highscore disponível.");
        }
    }
}
