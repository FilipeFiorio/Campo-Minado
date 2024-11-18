package br.edu.ifsp.campominado.controller;

import java.io.IOException;
import br.edu.ifsp.campominado.app2.App;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}