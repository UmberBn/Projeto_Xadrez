/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import boardgame.Tabuleiro;
import boardgame.Posicao;
import chess.Pieces.*;

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

    private void novasPecas(char collumn, int row, PecaDeXadrez pecas) {
        tabuleiro.placePiece(pecas, new ChessPosicao(collumn, row).toPosition());
    }

    private void posicaoInicial() {
        //Reis
        novasPecas('e', 8, new Rei(Cor.Brancas, tabuleiro));
        novasPecas('e', 1, new Rei(Cor.Brancas, tabuleiro));
        //Torres
        novasPecas('a', 1, new Torre(Cor.Brancas, tabuleiro));
        novasPecas('h', 1, new Torre(Cor.Brancas, tabuleiro));
        novasPecas('a', 8, new Torre(Cor.Pretas, tabuleiro));
        novasPecas('h', 8, new Torre(Cor.Pretas, tabuleiro));

    }

}
