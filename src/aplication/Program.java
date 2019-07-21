/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplication;

import boardgame.Tabuleiro;
import chess.PartidaDeXadrez;

/**
 *
 * @author Humberto Ban
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tabuleiro[][] tab=new Tabuleiro[8][8];
        PartidaDeXadrez partida=new PartidaDeXadrez();
        UI.printBoard(partida.getPecas());
    }
    
}
