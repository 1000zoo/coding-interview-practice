package chapter07_Object_Oriented_Programming.Prob10;

import java.util.Arrays;

public class GameManager {

    private final MineBoard mineBoard;
    private final CellState[][] cellStates;
    private boolean isPlayerDead;


    public GameManager() {
        mineBoard = new MineBoard(10, 10);
        cellStates = new CellState[10][10];
        setCellStates();
        isPlayerDead = false;
    }

    public GameManager(int r, int c) {
        mineBoard = new MineBoard(r, c);
        cellStates = new CellState[r][c];
        setCellStates();
        isPlayerDead = false;
    }

    private void setCellStates() {
        for (CellState[] cs : cellStates) {
            Arrays.fill(cs, CellState.UNREVEALED);
        }
    }

    public void plantFlag(int r, int c) {
        if (cellStates[r][c] == CellState.FLAG) {
            cellStates[r][c] = CellState.UNREVEALED;
            return;
        }
        cellStates[r][c] = CellState.FLAG;
    }

    public void searching(int r, int c) {
        if (mineBoard.isMine(r, c)) {
            isPlayerDead = true;
            return;
        }
        if (cellStates[r][c] == CellState.REVEALED) return;
        cellStates[r][c] = CellState.REVEALED;
        extending(r, c);
    }

    private void extending(int r, int c){
        if (!mineBoard.isNothing(r, c)) return;
        if (cellStates[r][c] == CellState.REVEALED) return;
        cellStates[r][c] = CellState.REVEALED;

        int[][] dirs = {{-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}};
        for (int[] dir : dirs) {
            int tr = r + dir[0];
            int tc = c + dir[1];
            if (0 <= tr && tr < cellStates.length && 0 <= tc && tc < cellStates[0].length) {
                extending(tr, tc);
            }
        }
    }

    public boolean gameOver() {
        return isPlayerDead;
    }

    public void print() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cellStates.length; i++) {
            for (int j = 0; j < cellStates[0].length; j++) {
                sb.append(cellToString(i, j));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private String cellToString(int r, int c) {
        CellState state = cellStates[r][c];

        if (state == CellState.REVEALED) {
            return mineBoard.getCellString(r, c);
        }
        if (state == CellState.UNREVEALED) {
            return "#";
        }
        return "!";
    }
}
