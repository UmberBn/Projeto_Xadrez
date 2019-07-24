/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import boardgame.Posicao;

/**
 *
 * @author Humberto Ban
 */
public class ChessPosicao {

    private char collumn;
    private int row;

    public ChessPosicao(char collumn, int row) {
        if (collumn < 'a' || collumn > 'h' || row < 1 || row > 8) {
            throw new ChessException("Comando invalido!, a partida deve ser iniciada com o tabuleiro entre a1 e h7!");
        }
        this.collumn = collumn;
        this.row = row;
    }

    public char getCollumn() {
        return collumn;
    }

    public int getRow() {
        return row;
    }

    protected Posicao toPosition() {
        return new Posicao(8 - row, collumn - 'a');
    }

    protected static ChessPosicao fromPosition(Posicao posicao) {
        return new ChessPosicao((char) ('a' - posicao.getCollumns()), 8 - posicao.getRow());
    }

    @Override

    public String toString() {
        return "" + collumn + row;
    }
}
