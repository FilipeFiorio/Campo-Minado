package br.edu.ifsp.campominado.controller;

import java.io.IOException;

import br.edu.ifsp.campominado.app2.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class comoJogarController {

    @FXML
    private Button botaoVoltar;

    @FXML
    void voltarParaTelaPrimary(ActionEvent event) throws IOException {
        App.setRoot( "primary");
    }
    
}