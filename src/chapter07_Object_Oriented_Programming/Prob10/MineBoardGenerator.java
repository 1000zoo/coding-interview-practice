package chapter07_Object_Oriented_Programming.Prob10;

import java.util.Random;

public class MineBoardGenerator {

    private final Cell[][] board;

    public MineBoardGenerator(int h, int w) {
        this.board = new Cell[h][w];
    }

    public Cell[][] generator() {
        mineGenerator();
        numberGenerator();
        return board;
    }

    private void mineGenerator() {
        for (Cell[] row : board) {
            for (int i = 0; i < row.length; i++) {
                if (isMine()) {
                    row[i] = new Cell(-1);
                }
            }
        }
    }

    private void numberGenerator() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != null) continue;
                board[i][j] = new Cell(countAroundMines(i, j));
            }
        }
    }

    private int countAroundMines(int r, int c) {
        int[][] dirs = {{-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}};
        int count = 0;

        for (int[] dir : dirs) {
            int tr = r + dir[0];
            int tc = c + dir[1];
            if (isWithinBoundary(tr, tc) && board[tr][tc] != null && board[tr][tc].isMine()) {
                count++;
            }
        }

        return count;
    }

    private boolean isWithinBoundary(int r, int c) {
        return 0 <= r && r < board.length && 0 <= c && c < board[0].length;
    }

    private boolean isMine() {
        double probability = 0.15;
        Random random = new Random();
        return random.nextDouble() <= probability;
    }
}
