/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplication;

import chess.PecaDeXadrez;

/**
 *
 * @author Humberto Ban
 */
public class UI {
    
    public static void printBoard(PecaDeXadrez[][] pecas) {
        for (int i = 0; i < pecas.length; i++) {
            System.out.print((8 - i) + " ");
            for (int p = 0; p < pecas.length; p++) {
                printPeca(pecas[i][p]);
            }
            System.out.println("");
        }
        System.out.println("  a b c d e f g h");
    }
    
    public static void printPeca(PecaDeXadrez peca) {
        if (peca == null) {
            System.out.print("-");
        } else {
            System.out.print(peca);
        }
        System.out.print(" ");
    }
}
