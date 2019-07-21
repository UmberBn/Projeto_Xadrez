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
        this.rows = rows;
        this.collumns = collumns;
        peças = new Peca[rows][collumns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCollumns() {
        return collumns;
    }

    public void setCollumns(int collumns) {
        this.collumns = collumns;
    }

    public Peca peça(int row, int collumns) {
        return peças[row][collumns];
    }

    public Peca peça(Posicao pos) {
        return peças[pos.getRow()][pos.getCollumns()];
    }
    
}
