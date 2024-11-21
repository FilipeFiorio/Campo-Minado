package br.edu.ifsp.campominado.controller;

import java.io.IOException;
import br.edu.ifsp.campominado.app2.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private MenuItem audio;

    @FXML
    private MenuItem credits;

    @FXML
    private MenuItem exit;

    @FXML
    private Button highScore;

    @FXML
    private MenuItem howToPlay;

    @FXML
    private Button jogar;

    @FXML
    void enableAudio(ActionEvent event) {

    }

    @FXML
    void exitProgram(ActionEvent event) {

    }

    @FXML
    void showCredits(ActionEvent event) {

    }

    @FXML
    void showHighScores(ActionEvent event) {

    }

    @FXML
    void showHowToPlay(ActionEvent event) {

    }

    @FXML
    void startGame(ActionEvent event) {

    }

}
