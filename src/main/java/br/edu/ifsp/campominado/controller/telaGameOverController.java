package br.edu.ifsp.campominado.controller;

import java.io.IOException;

import br.edu.ifsp.campominado.app2.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class telaGameOverController {
    
    @FXML
    private Button botaoTentarDeNovo;

    @FXML
    private Button botaoVoltarInicio;

    @FXML
    void TentarDeNovo(ActionEvent event) {

    }

    @FXML
    void voltarInicio(ActionEvent event) throws IOException {
        App.setRoot( "primary" );
    }
}
