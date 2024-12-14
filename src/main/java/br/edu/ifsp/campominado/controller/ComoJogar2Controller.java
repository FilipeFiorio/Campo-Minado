package br.edu.ifsp.campominado.controller;

import java.io.IOException;

import br.edu.ifsp.campominado.app2.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ComoJogar2Controller {
    
    @FXML
    private Button botaoSeta;

    @FXML
    void paginaAnterior(ActionEvent event) throws IOException {
        App.setRoot( "ComoJogar");
    }
}
