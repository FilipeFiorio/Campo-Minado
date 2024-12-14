package br.edu.ifsp.campominado.controller;

import java.io.IOException;
import java.util.Random;

import br.edu.ifsp.campominado.app2.App;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class telaDoJogoDificilController {
        
    @FXML
    private Label lblMinas;

    @FXML
    private Label lblPontuacao;

    @FXML
    private Label lblTempo;

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
    private Button button06;

    @FXML
    private Button button07;

    @FXML
    private Button button08;

    @FXML
    private Button button09;

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
    private Button button16;

    @FXML
    private Button button17;

    @FXML
    private Button button18;

    @FXML
    private Button button19;

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
    private Button button26;

    @FXML
    private Button button27;

    @FXML
    private Button button28;

    @FXML
    private Button button29;

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
    private Button button36;

    @FXML
    private Button button37;

    @FXML
    private Button button38;

    @FXML
    private Button button39;

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
    private Button button46;

    @FXML
    private Button button47;

    @FXML
    private Button button48;

    @FXML
    private Button button49;

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
    private Button button56;

    @FXML
    private Button button57;

    @FXML
    private Button button58;

    @FXML
    private Button button59;

    @FXML
    private Button button60;

    @FXML
    private Button button61;

    @FXML
    private Button button62;

    @FXML
    private Button button63;

    @FXML
    private Button button64;

    @FXML
    private Button button65;

    @FXML
    private Button button66;

    @FXML
    private Button button67;

    @FXML
    private Button button68;

    @FXML
    private Button button69;

    @FXML
    private Button button70;

    @FXML
    private Button button71;

    @FXML
    private Button button72;

    @FXML
    private Button button73;

    @FXML
    private Button button74;

    @FXML
    private Button button75;

    @FXML
    private Button button76;

    @FXML
    private Button button77;

    @FXML
    private Button button78;

    @FXML
    private Button button79;

    @FXML
    private Button button80;

    @FXML
    private Button button81;

    @FXML
    private Button button82;

    @FXML
    private Button button83;

    @FXML
    private Button button84;

    @FXML
    private Button button85;

    @FXML
    private Button button86;

    @FXML
    private Button button87;

    @FXML
    private Button button88;

    @FXML
    private Button button89;

    @FXML
    private Button button90;

    @FXML
    private Button button91;

    @FXML
    private Button button92;

    @FXML
    private Button button93;

    @FXML
    private Button button94;

    @FXML
    private Button button95;

    @FXML
    private Button button96;

    @FXML
    private Button button97;

    @FXML
    private Button button98;

    @FXML
    private Button button99;
    
    private static final int TAMANHO = 10;
    private int[][] tabuleiro;
    private Button[][] botoes;
    private boolean[][] marcacoes;
    private int minasRestantes = 25;
    private int pontuacao = 0;
    private int segundos = 30;
    private Timeline timeline;

    @FXML
    public void initialize() throws IOException {
        botoes = new Button[TAMANHO][TAMANHO];
        tabuleiro = new int[TAMANHO][TAMANHO];
        marcacoes = new boolean[TAMANHO][TAMANHO];

        botoes[0][0] = button00; botoes[0][1] = button01; botoes[0][2] = button02; botoes[0][3] = button03; botoes[0][4] = button04;
        botoes[0][5] = button05; botoes[0][6] = button06; botoes[0][7] = button07; botoes[0][8] = button08; botoes[0][9] = button09;
        
        botoes[1][0] = button10; botoes[1][1] = button11; botoes[1][2] = button12; botoes[1][3] = button13; botoes[1][4] = button14;
        botoes[1][5] = button15; botoes[1][6] = button16; botoes[1][7] = button17; botoes[1][8] = button18; botoes[1][9] = button19;
        
        botoes[2][0] = button20; botoes[2][1] = button21; botoes[2][2] = button22; botoes[2][3] = button23; botoes[2][4] = button24;
        botoes[2][5] = button25; botoes[2][6] = button26; botoes[2][7] = button27; botoes[2][8] = button28; botoes[2][9] = button29;
        
        botoes[3][0] = button30; botoes[3][1] = button31; botoes[3][2] = button32; botoes[3][3] = button33; botoes[3][4] = button34;
        botoes[3][5] = button35; botoes[3][6] = button36; botoes[3][7] = button37; botoes[3][8] = button38; botoes[3][9] = button39;
        
        botoes[4][0] = button40; botoes[4][1] = button41; botoes[4][2] = button42; botoes[4][3] = button43; botoes[4][4] = button44;
        botoes[4][5] = button45; botoes[4][6] = button46; botoes[4][7] = button47; botoes[4][8] = button48; botoes[4][9] = button49;
        
        botoes[5][0] = button50; botoes[5][1] = button51; botoes[5][2] = button52; botoes[5][3] = button53; botoes[5][4] = button54;
        botoes[5][5] = button55; botoes[5][6] = button56; botoes[5][7] = button57; botoes[5][8] = button58; botoes[5][9] = button59;
        
        botoes[6][0] = button60; botoes[6][1] = button61; botoes[6][2] = button62; botoes[6][3] = button63; botoes[6][4] = button64;
        botoes[6][5] = button65; botoes[6][6] = button66; botoes[6][7] = button67; botoes[6][8] = button68; botoes[6][9] = button69;
        
        botoes[7][0] = button70; botoes[7][1] = button71; botoes[7][2] = button72; botoes[7][3] = button73; botoes[7][4] = button74;
        botoes[7][5] = button75; botoes[7][6] = button76; botoes[7][7] = button77; botoes[7][8] = button78; botoes[7][9] = button79;
        
        botoes[8][0] = button80; botoes[8][1] = button81; botoes[8][2] = button82; botoes[8][3] = button83; botoes[8][4] = button84;
        botoes[8][5] = button85; botoes[8][6] = button86; botoes[8][7] = button87; botoes[8][8] = button88; botoes[8][9] = button89;
        
        botoes[9][0] = button90; botoes[9][1] = button91; botoes[9][2] = button92; botoes[9][3] = button93; botoes[9][4] = button94;
        botoes[9][5] = button95; botoes[9][6] = button96; botoes[9][7] = button97; botoes[9][8] = button98; botoes[9][9] = button99;

        inicializarTabuleiro();

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
}
