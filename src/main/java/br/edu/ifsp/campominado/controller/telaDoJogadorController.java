package br.edu.ifsp.campominado.controller;

import br.edu.ifsp.campominado.entidades.Jogador;

import java.io.*;
import com.google.gson.*;
import br.edu.ifsp.campominado.app2.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.application.Platform;

public class telaDoJogadorController {

    private static final String ARQUIVO_JOGADOR = "jogador.json";

    @FXML
    private Button botaoSairDoJogo;

    @FXML
    private TextField caixaDeTexto;

    @FXML
    void InserirNomeDeUsuario(ActionEvent event) throws IOException {
        TextField txtNomeDoUsuario = (TextField) event.getSource();
        String nomeUsuario = txtNomeDoUsuario.getText();

        int pontuacao = 100;
        String dificuldade = "Média";

        Jogador jogador = new Jogador(nomeUsuario, pontuacao, dificuldade);

        Gson gson = new Gson();
        String json = gson.toJson(jogador);

        File arquivo = new File(ARQUIVO_JOGADOR);
        if (arquivo.exists()) {
            try (FileWriter writer = new FileWriter(ARQUIVO_JOGADOR)) {
                writer.write(json);
                System.out.println("Dados do jogador atualizados com sucesso!");
            } catch (IOException e) {
                System.out.println("Erro ao salvar os dados do jogador: " + e.getMessage());
            }
        } else {
            try (FileWriter writer = new FileWriter(ARQUIVO_JOGADOR)) {
                writer.write(json);
                System.out.println("Dados do jogador salvos com sucesso!");
            } catch (IOException e) {
                System.out.println("Erro ao salvar os dados do jogador: " + e.getMessage());
            }
        }

        App.setRoot("primary");
    }

    @FXML
    void sairDoJogo(ActionEvent event) {
        Platform.exit();
    }
}
