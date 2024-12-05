package br.edu.ifsp.campominado.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.edu.ifsp.campominado.app2.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.application.Platform;

public class telaDoJogadorController {
    
    @FXML
    private Button botaoSairDoJogo;

    @FXML
    private TextField caixaDeTexto;

    @FXML
    void InserirNomeDeUsuario(ActionEvent event) throws IOException {
        TextField txtNomeDoUsuario = ( TextField ) event.getSource();
        String nomeUsuario = txtNomeDoUsuario.getText();

        try( FileWriter writer = new FileWriter( "nome_jogador.txt" ) ) {
            writer.write( nomeUsuario );
            System.out.println( "Nome salvo com Sucesso" );
        }
        catch( IOException e ) {
            System.out.println( "Erro ao salvear o nome do jogador: " + e.getMessage() );
        }

        try ( BufferedReader reader = new BufferedReader( new FileReader( "nome_jogador.txt") ) ) {
            String nomeLido = reader.readLine();
            System.out.println( "Nome do jogador lido: " + nomeLido );
        }
        catch (IOException e ) {
            System.out.println( "erro ao ler o nome do jogador: " + e.getMessage() );
        }
        App.setRoot( "primary" );
    }

    @FXML
    void sairDoJogo(ActionEvent event) {
        Platform.exit();
    }
}
