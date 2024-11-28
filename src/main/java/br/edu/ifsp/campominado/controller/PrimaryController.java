package br.edu.ifsp.campominado.controller;

import java.io.IOException;
import br.edu.ifsp.campominado.app2.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private Button botaoComoJogar;

    @FXML
    private Button botaoHighScore;

    @FXML
    private Button botaoJogar;

    @FXML
    private Button botaoSairDoJogo;

    @FXML
    void Jogar(ActionEvent event) throws IOException {
        
    }

    @FXML
    void mostrarComoJogar(ActionEvent event) throws IOException {
        App.setRoot( "comoJogar");
    }

    @FXML
    void mostrarHighScores(ActionEvent event) throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    void sairDoJogo(ActionEvent event) {

    }


}
