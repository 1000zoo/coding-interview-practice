package chapter07_Object_Oriented_Programming.Prob10;

public class Player {

    private GameManager gameManager;

    public Player() {}
    public void startGame() {
        gameManager = new GameManager();
    }
    public void rightClick(int r, int c) {
        gameManager.plantFlag(r, c);
    }
    public void leftClick(int r, int c) {
        gameManager.searching(r, c);
    }
    public void print() {
        gameManager.print();
    }
    public boolean gameOver() {
        return gameManager.gameOver();
    }
}
