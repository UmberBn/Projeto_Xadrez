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
    private int collum;

    public Posicao(int row, int collum) {
        this.row = row;
        this.collum = collum;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCollum() {
        return collum;
    }

    public void setCollum(int collum) {
        this.collum = collum;
    }

    @Override
    public String toString() {
        return "Posi\u00e7\u00e3o{" + "row=" + row + ", collum=" + collum + '}';
    }
    
    
    
}
