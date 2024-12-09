package br.edu.ifsp.campominado.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

import br.edu.ifsp.campominado.app2.App;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class telaDoJogoFacilController {
    
    
    @FXML
    private Label lblMinas;

    @FXML
    private Label lblPontuacao;

    @FXML
    private Label lblTempo;

    private int segundos = 60;
    private Timeline timeline;

    @FXML
    public void initialize() {
        timeline = new Timeline( new KeyFrame( Duration.seconds(1), event -> {
            segundos--;
            lblTempo.setText( "Tempo: " + segundos);
             if ( segundos <= 0 ) {
                try {
                    timeline.stop();
                    App.setRoot( "telaGameOver");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } ) );
        timeline.setCycleCount( Timeline.INDEFINITE );
        timeline.play();
    }

}
