/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

/**
 *
 * @author Humberto Ban
 */
public class Tabuleiro {

    private int rows;
    private int collumns;
    private Peca[][] peças;

    public Tabuleiro(int rows, int collumns) {
        if (rows < 1 || collumns < 1) {
            throw new BoardException("Erro na criação de tabuleiro: numero de linhas ou colunas insuficientes");
        }
        this.rows = rows;
        this.collumns = collumns;
        peças = new Peca[rows][collumns];
    }

    public int getRows() {
        return rows;
    }

    public int getCollumns() {
        return collumns;
    }

    public Peca peça(int row, int collumns) {
        if (!posicaoExistente(row, collumns)) {
            throw new BoardException("Posição inexistente!");
        }
        return peças[row][collumns];
    }

    public Peca peça(Posicao pos) {
        if (!posicaoExistente(pos)) {
            throw new BoardException("Posição inexistente!");
        }

        return peças[pos.getRow()][pos.getCollumns()];
    }

    public void placePiece(Peca peca, Posicao posicao) {
        if (posicaoOcupada(posicao)) {
            throw new BoardException("Ja existe uma peça na " + posicao);
        }
        peças[posicao.getRow()][posicao.getCollumns()] = peca;
        peca.posicao = posicao;

    }

    private boolean posicaoExistente(int row, int collumn) {
        return row >= 0 && row < rows && collumn >= 0 && collumn < collumns;
    }

    public boolean posicaoExistente(Posicao posicao) {
        return posicaoExistente(posicao.getRow(), posicao.getCollumns());
    }

    public boolean posicaoOcupada(Posicao posicao) {
        if (!posicaoExistente(posicao)) {
            throw new BoardException("Posição inexistente!");
        }
        return peça(posicao) != null;
    }

}
