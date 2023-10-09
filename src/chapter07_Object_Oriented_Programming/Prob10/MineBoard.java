package chapter07_Object_Oriented_Programming.Prob10;

public class MineBoard {

    private final Cell[][] board;

    public MineBoard(int r, int c) {
        MineBoardGenerator generator = new MineBoardGenerator(r, c);
        board = generator.generator();
    }
    public boolean isMine(int r, int c) {
        return board[r][c].isMine();
    }
    public boolean isNothing(int r, int c) {
        return board[r][c].isZero();
    }
    public String getCellString(int r, int c) {
        return board[r][c].toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Cell[] row : board) {
            for (Cell cell : row) {
                sb.append("|").append(cell);
            }
            sb.append("|\n");
        }

        return sb.toString();
    }
}
