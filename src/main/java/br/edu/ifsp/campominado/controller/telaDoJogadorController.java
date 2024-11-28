package br.edu.ifsp.campominado.controller;

import java.io.IOException;

import br.edu.ifsp.campominado.app2.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class telaDoJogadorController {
    
    @FXML
    private Button botaoSairDoJogo;

    @FXML
    private TextField caixaDeTexto;

    @FXML
    void InserirNomeDeUsuario(ActionEvent event) throws IOException {
        App.setRoot( "primary" );
    }

    @FXML
    void sairDoJogo(ActionEvent event) {
        
    }
}
