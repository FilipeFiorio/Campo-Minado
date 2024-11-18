package br.edu.ifsp.campominado.controller;

import java.io.IOException;
import br.edu.ifsp.campominado.app2.App;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
