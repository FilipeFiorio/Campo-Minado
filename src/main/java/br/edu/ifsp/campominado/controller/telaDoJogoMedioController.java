package br.edu.ifsp.campominado.controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class telaDoJogoMedioController {
        
    @FXML
    private Label lblMinas;

    @FXML
    private Label lblPontuacao;

    @FXML
    private Label lblTempo;

    private int segundos = 45;
    private Timeline timeline;

    @FXML
    public void initialize() {
        timeline = new Timeline( new KeyFrame( Duration.seconds(1), event -> {
            segundos--;
            lblTempo.setText( "Tempo: " + segundos);
        } ) );
        timeline.setCycleCount( Timeline.INDEFINITE );
        timeline.play();
    }

}
