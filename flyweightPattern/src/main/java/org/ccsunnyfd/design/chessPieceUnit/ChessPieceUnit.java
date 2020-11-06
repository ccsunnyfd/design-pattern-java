package org.ccsunnyfd.design.chessPieceUnit;

import lombok.AllArgsConstructor;

/**
 * ChessPieceUnit
 *
 * @version 1.0
 */
@AllArgsConstructor
public class ChessPieceUnit {
    private int id;
    private String text;
    private Color color;

    public static enum Color {
        RED, BLACK
    }

    @Override
    public String toString() {
        return "id: " + id + ", text: " + text + ", color: " + color;
    }
}
