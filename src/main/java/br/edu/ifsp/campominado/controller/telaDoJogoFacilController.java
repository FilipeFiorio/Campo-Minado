package br.edu.ifsp.campominado.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.Random;

import br.edu.ifsp.campominado.app2.App;
import br.edu.ifsp.campominado.entidades.GameData;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class telaDoJogoFacilController {

    @FXML
    private Button button00;

    @FXML
    private Button button01;

    @FXML
    private Button button02;

    @FXML
    private Button button03;

    @FXML
    private Button button04;

    @FXML
    private Button button05;

    @FXML
    private Button button10;

    @FXML
    private Button button11;

    @FXML
    private Button button12;

    @FXML
    private Button button13;

    @FXML
    private Button button14;

    @FXML
    private Button button15;

    @FXML
    private Button button20;

    @FXML
    private Button button21;

    @FXML
    private Button button22;

    @FXML
    private Button button23;

    @FXML
    private Button button24;

    @FXML
    private Button button25;

    @FXML
    private Button button30;

    @FXML
    private Button button31;

    @FXML
    private Button button32;

    @FXML
    private Button button33;

    @FXML
    private Button button34;

    @FXML
    private Button button35;

    @FXML
    private Button button40;

    @FXML
    private Button button41;

    @FXML
    private Button button42;

    @FXML
    private Button button43;

    @FXML
    private Button button44;

    @FXML
    private Button button45;

    @FXML
    private Button button50;

    @FXML
    private Button button51;

    @FXML
    private Button button52;

    @FXML
    private Button button53;

    @FXML
    private Button button54;

    @FXML
    private Button button55;

    @FXML
    private Label lblMinas;

    @FXML
    private Label lblPontuacao;

    @FXML
    private Label lblTempo;

    private static final int TAMANHO = 6;
    private int[][] tabuleiro;
    private Button[][] botoes;
    private boolean[][] marcacoes;
    private int minasRestantes = 6;
    private int pontuacao = 0;
    private int segundos = 60;
    private Timeline timeline;


    @FXML
    public void initialize() throws IOException {
        botoes = new Button[TAMANHO][TAMANHO];
        tabuleiro = new int[TAMANHO][TAMANHO];
        marcacoes = new boolean[TAMANHO][TAMANHO];

        botoes[0][0] = button00; botoes[0][1] = button01; botoes[0][2] = button02; botoes[0][3] = button03; botoes[0][4] = button04;
        botoes[0][5] = button05; 
        
        botoes[1][0] = button10; botoes[1][1] = button11; botoes[1][2] = button12; botoes[1][3] = button13; botoes[1][4] = button14;
        botoes[1][5] = button15; 
        
        botoes[2][0] = button20; botoes[2][1] = button21; botoes[2][2] = button22; botoes[2][3] = button23; botoes[2][4] = button24;
        botoes[2][5] = button25;
        
        botoes[3][0] = button30; botoes[3][1] = button31; botoes[3][2] = button32; botoes[3][3] = button33; botoes[3][4] = button34;
        botoes[3][5] = button35;
        
        botoes[4][0] = button40; botoes[4][1] = button41; botoes[4][2] = button42; botoes[4][3] = button43; botoes[4][4] = button44;
        botoes[4][5] = button45; 
        
        botoes[5][0] = button50; botoes[5][1] = button51; botoes[5][2] = button52; botoes[5][3] = button53; botoes[5][4] = button54;
        botoes[5][5] = button55; 

        inicializarTabuleiro();

        lblPontuacao.setText("Pontos: " + pontuacao);
        lblMinas.setText("Minas: " + minasRestantes);

        timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            segundos--;
            lblTempo.setText("Tempo: " + segundos);
            if (segundos <= 0) {
                try {
                    timeline.stop();
                    App.setRoot("telaGameOver");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    private void inicializarTabuleiro() {
        Random random = new Random();
        for (int i = 0; i < minasRestantes; i++) {
            int linha, coluna;
            do {
                linha = random.nextInt(TAMANHO);
                coluna = random.nextInt(TAMANHO);
            } while (tabuleiro[linha][coluna] == -1);

            tabuleiro[linha][coluna] = -1;
        }

        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                if (tabuleiro[i][j] != -1) {
                    int count = 0;
                    for (int di = -1; di <= 1; di++) {
                        for (int dj = -1; dj <= 1; dj++) {
                            int ni = i + di;
                            int nj = j + dj;
                            if (ni >= 0 && ni < TAMANHO && nj >= 0 && nj < TAMANHO) {
                                if (tabuleiro[ni][nj] == -1) {
                                    count++;
                                }
                            }
                        }
                    }
                    tabuleiro[i][j] = count;
                }
            }
        }
    }

    private boolean primeiraJogada = true;

    private void revelarCelula(int row, int col) {
        if (botoes[row][col].isDisabled()) {
            return;
        }
    
        if (primeiraJogada) {
            primeiraJogada = false;
            garantirPrimeiraCelulaSegura(row, col);
        }
    
        botoes[row][col].setDisable(true);
    
        if (tabuleiro[row][col] == -1) {
            botoes[row][col].setStyle("-fx-background-color: red;");
            timeline.stop();
            try {
                App.setRoot("telaGameOver");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            botoes[row][col].setText(String.valueOf(tabuleiro[row][col]));
            pontuacao += 100;
            lblPontuacao.setText("Pontos: " + pontuacao);
            GameData.setPontuacao( pontuacao );
    
            if (tabuleiro[row][col] == 0) {
                for (int di = -1; di <= 1; di++) {
                    for (int dj = -1; dj <= 1; dj++) {
                        int ni = row + di;
                        int nj = col + dj;
                        if (ni >= 0 && ni < TAMANHO && nj >= 0 && nj < TAMANHO) {
                            revelarCelula(ni, nj);
                        }
                    }
                }
            }

            verificarFimDoJogo();
        }
    }
    
    private void garantirPrimeiraCelulaSegura(int row, int col) {
    
        for (int di = -1; di <= 1; di++) {
            for (int dj = -1; dj <= 1; dj++) {
                int ni = row + di;
                int nj = col + dj;
                if (ni >= 0 && ni < TAMANHO && nj >= 0 && nj < TAMANHO) {
                    if (tabuleiro[ni][nj] == -1) {
                        moverBomba(ni, nj);
                    }
                }
            }
        }
    
        atualizarTabuleiro();
    }
    
    private void moverBomba(int row, int col) {
        Random random = new Random();
        int novaLinha, novaColuna;
        do {
            novaLinha = random.nextInt(TAMANHO);
            novaColuna = random.nextInt(TAMANHO);
        } while (tabuleiro[novaLinha][novaColuna] == -1 || 
                 (Math.abs(novaLinha - row) <= 1 && Math.abs(novaColuna - col) <= 1));
        tabuleiro[row][col] = 0;
        tabuleiro[novaLinha][novaColuna] = -1;
    }
    
    private void atualizarTabuleiro() {
        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                if (tabuleiro[i][j] != -1) {
                    int count = 0;
                    for (int di = -1; di <= 1; di++) {
                        for (int dj = -1; dj <= 1; dj++) {
                            int ni = i + di;
                            int nj = j + dj;
                            if (ni >= 0 && ni < TAMANHO && nj >= 0 && nj < TAMANHO) {
                                if (tabuleiro[ni][nj] == -1) {
                                    count++;
                                }
                            }
                        }
                    }
                    tabuleiro[i][j] = count;
                }
            }
        }
    }

    private void marcarCelula(int row, int col) {
        if (!botoes[row][col].isDisabled()) {
            if (!marcacoes[row][col]) {
                marcacoes[row][col] = true;
                botoes[row][col].setStyle("-fx-background-color: yellow;");
                minasRestantes--;
            } else {
                marcacoes[row][col] = false;
                botoes[row][col].setStyle("");
                minasRestantes++;
            }
            lblMinas.setText("Minas: " + minasRestantes);
        }
    }

    @FXML
    public void onButtonClick(MouseEvent event) {
        Button clickedButton = (Button) event.getSource();

        int row = -1, col = -1;
        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                if (botoes[i][j] == clickedButton) {
                    row = i;
                    col = j;
                    break;
                }
            }
        }

        if (row == -1 || col == -1) {
            return;
        }

        if (event.getButton() == javafx.scene.input.MouseButton.PRIMARY) {
            revelarCelula(row, col);
        } else if (event.getButton() == javafx.scene.input.MouseButton.SECONDARY) {
            marcarCelula(row, col);
        }
    }

    private void verificarFimDoJogo() {
        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                if (tabuleiro[i][j] != -1 && !botoes[i][j].isDisabled()) {
                    return;
                }
            }
        }
    
        timeline.stop();

        pontuacao = pontuacao + segundos * 20;

        try {
            GameData.setPontuacao(pontuacao); 
            App.setRoot("telaDeVitoria");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
