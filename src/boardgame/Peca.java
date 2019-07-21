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
public class Peca {

    protected Posicao posicao;
    protected Tabuleiro tabuleiro;

    public Peca(Tabuleiro tabuleiro) {
        this.posicao = null;
        this.tabuleiro = tabuleiro;
    }

    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

}
