/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import boardgame.Tabuleiro;
import boardgame.Posicao;
import chess.Pieces.Rei;
import chess.Pieces.Torre;

/**
 *
 * @author Humberto Ban
 */
public class PartidaDeXadrez {

    private Tabuleiro tabuleiro;

    public PartidaDeXadrez() {
        tabuleiro = new Tabuleiro(8, 8);
        posicaoInicial();
    }

    public PecaDeXadrez[][] getPecas() {
        PecaDeXadrez[][] mat = new PecaDeXadrez[tabuleiro.getRows()][tabuleiro.getCollumns()];
        for (int i = 0; i < tabuleiro.getRows(); i++) {
            for (int j = 0; j < tabuleiro.getCollumns(); j++) {
                mat[i][j] = (PecaDeXadrez) tabuleiro.peça(i, j);

            }
        }

        return mat;
    }

    private void posicaoInicial() {
        tabuleiro.placePiece(new Torre(Cor.Brancas,tabuleiro), new Posicao(9,9));
        tabuleiro.placePiece(new Torre(Cor.Brancas,tabuleiro), new Posicao(9,9));
        tabuleiro.placePiece(new Rei(Cor.Brancas,tabuleiro),new Posicao(0,4));
        tabuleiro.placePiece(new Rei(Cor.Pretas,tabuleiro),new Posicao(7,4));
        tabuleiro.placePiece(new Torre(Cor.Brancas,tabuleiro), new Posicao(7,0));
        tabuleiro.placePiece(new Torre(Cor.Brancas,tabuleiro), new Posicao(7,7));
        
    }
    
    
}
