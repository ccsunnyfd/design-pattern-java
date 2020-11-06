package org.ccsunnyfd.design;

import org.ccsunnyfd.design.chessBoard.ChessBoard;

/**
 * Demo
 *
 * @version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        ChessBoard cb = new ChessBoard();
        System.out.println(cb.getChessPieces());
        cb.move(1, 10, 2);
        cb.move(2, 3, 4);
        System.out.println(cb.getChessPieces());
    }
}
