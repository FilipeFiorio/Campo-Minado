package br.edu.ifsp.campominado.controller;

import java.io.IOException;

import br.edu.ifsp.campominado.app2.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;

public class telaJogarController {
    
    @FXML
    private Button botaoDificil;

    @FXML
    private Button botaoFacil;

    @FXML
    private Button botaoIniciar;

    @FXML
    private Button botaoMedio;

    @FXML
    private Button botaoVoltar;

    @FXML
    private MenuItem umMinuto;

    @FXML
    void VoltarParaOPrimary(ActionEvent event) throws IOException {
        App.setRoot("Primary" );
    }

    @FXML
    void inciarJogo(ActionEvent event) {

    }

    @FXML
    void mostrarPredefinicoesDificil(MouseEvent event) {

    }

    @FXML
    void mostrarPredefinicoesFacil(MouseEvent event) {

    }

    @FXML
    void mostrarPredefinicoesMedio(MouseEvent event) {

    }

    @FXML
    void ocultarPredefinicoesDificil(MouseEvent event) {

    }

    @FXML
    void ocultarPredefinicoesMedio(MouseEvent event) {

    }

    @FXML
    void setarDificuldadeDificil(ActionEvent event) {

    }

    @FXML
    void setarDificuldadeFacil(ActionEvent event) {

    }

    @FXML
    void setarDificuldadeMedio(ActionEvent event) {

    }
}
