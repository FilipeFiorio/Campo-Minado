package br.edu.ifsp.campominado.controller;

import java.io.IOException;
import br.edu.ifsp.campominado.app2.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

public class SecondaryController {

    @FXML
    private MenuItem audio;

    @FXML
    private Button backToPrimary;

    @FXML
    private MenuItem comoJogar;

    @FXML
    private MenuItem creditos;

    @FXML
    private ListView<?> lista;

    @FXML
    private MenuItem sair;

    @FXML
    private Menu sobre;

    @FXML
    void desligarAudio(ActionEvent event) {

    }

    @FXML
    void goToPrimary(ActionEvent event) throws IOException {
        App.setRoot("primary");
    }

    @FXML
    void mostrarComoJogar(ActionEvent event) {

    }

    @FXML
    void mostrarCreditos(ActionEvent event) {

    }

    @FXML
    void mostrarSobre(ActionEvent event) {

    }

    @FXML
    void sairDoJogo(ActionEvent event) {

    }
}