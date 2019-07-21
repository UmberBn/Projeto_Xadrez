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
public class Posicao {
    private int row;
    private int collumns;

    public Posicao(int row, int collumns) {
        this.row = row;
        this.collumns = collumns;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCollumns() {
        return collumns;
    }

    public void setCollumns(int collumns) {
        this.collumns = collumns;
    }

    @Override
    public String toString() {
        return  "Linha" + row + ", Coluna" + collumns ;
    }
    
    
    
}
