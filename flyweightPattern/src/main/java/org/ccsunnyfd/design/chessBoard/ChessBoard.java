package org.ccsunnyfd.design.chessBoard;

import lombok.Getter;
import org.ccsunnyfd.design.chessPiece.ChessPiece;
import org.ccsunnyfd.design.chessPieceUnit.ChessPieceUnitFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * ChessBoard
 *
 * @version 1.0
 */
@Getter
public class ChessBoard {
    private Map<Integer, ChessPiece> chessPieces = new HashMap<>();

    public ChessBoard() {
        init();
    }

    private void init() {
        chessPieces.put(1, new ChessPiece(
                ChessPieceUnitFactory.getChessPiece(1), 0, 0));
        chessPieces.put(2, new ChessPiece(
                ChessPieceUnitFactory.getChessPiece(2), 1, 0));
    }

    public void move(int chessPieceId, int toPositionX, int toPositionY) {
        if(chessPieces.containsKey(chessPieceId)) {
            ChessPiece cp = chessPieces.get(chessPieceId);
            cp.setPositionX(toPositionX);
            cp.setPositionY(toPositionY);
        }
    }
}
