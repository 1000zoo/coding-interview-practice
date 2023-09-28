package chapter07_Object_Oriented_Programming.Prob08;

import java.util.Arrays;

public class Board {
    private Piece[][] board;
    private int totalPieces;

    public Board(int row, int col) {
        this.board = new Piece[row][col];
        totalPieces = 0;
    }

    public void initialize() {}

    public boolean placePiece(int row, int col, Piece piece) {
        return false;
    }

    public boolean isGameOver() {
        return false;
    }

    public int getScore(Color color) {
        int white = getWhitePieces();
        return Color.isWhite(color) ? white : totalPieces - white;
    }

    private int getWhitePieces() {
        int white = 0;
        for (Piece[] row : board) {
            for (Piece col : row) {
                if (col.isWhite()) white++;
            }
        }
        return white;
    }
}
