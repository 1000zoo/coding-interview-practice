package chapter07_Object_Oriented_Programming.Prob08;

public class GameManager {

    private static GameManager instance = null;
    private static Board board = null;
    private final int ROW = 10;
    private final int COL = 10;

    private GameManager() {
        board = new Board(ROW, COL);
    }

    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    public static boolean placePiece(int row, int col) {
        return false;
    }

    public static boolean isGameOver() {
        return board.isGameOver();
    }

    public int getScore(Player player) {
        return board.getScore(player.getColor());
    }
}
