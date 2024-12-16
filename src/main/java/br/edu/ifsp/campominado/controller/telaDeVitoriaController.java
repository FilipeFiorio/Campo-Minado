package br.edu.ifsp.campominado.controller;

import java.io.IOException;

import br.edu.ifsp.campominado.app2.App;
import br.edu.ifsp.campominado.entidades.GameData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class telaDeVitoriaController {
    
    @FXML
    private Button botaoContinuar;

    @FXML
    private Label lblPontuacao;

    @FXML
    void volatarAoPrimary(ActionEvent event) throws IOException {
        App.setRoot( "primary");
    }

    @FXML
    public void initialize() {
        lblPontuacao.setText( " " + GameData.getPontuacao());
    }

}
