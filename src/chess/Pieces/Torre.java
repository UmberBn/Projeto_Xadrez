/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess.Pieces;

import boardgame.Tabuleiro;
import chess.Cor;
import chess.PecaDeXadrez;

/**
 *
 * @author Humberto Ban
 */
public class Torre extends PecaDeXadrez {

    public Torre(Cor cor, Tabuleiro tabuleiro) {
        super(cor, tabuleiro);
    }

    @Override

    public String toString() {
        return "T";
    }
}
