package org.ccsunnyfd.design.chessPiece;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.ccsunnyfd.design.chessPieceUnit.ChessPieceUnit;

/**
 * ChessPiece
 *
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@Setter
public class ChessPiece {
    private ChessPieceUnit chessPieceUnit;
    private int positionX;
    private int positionY;

    @Override
    public String toString() {
        return "[" + chessPieceUnit + ", x: " + positionX + ", y: " + positionY + "]";
    }
}
