package chapter07_Object_Oriented_Programming.Prob08;

public class Player {

    private final Color color;
    private final GameManager gameManager;

    public Player(Color color) {
        this.color = color;
        gameManager = GameManager.getInstance();
    }

    public Color getColor() {
        return color;
    }

    public boolean placePiece(int row, int col) {
        return GameManager.placePiece(row, col);
    }

    public int getScore() {
        return gameManager.getScore(this);
    }
}
