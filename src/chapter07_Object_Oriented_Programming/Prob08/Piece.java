package chapter07_Object_Oriented_Programming.Prob08;

public class Piece {
    private Color color;

    public Piece(Color color) {
        this.color = color;
    }

    public void flip() {
        this.color = Color.getOpposite(this.color);
    }

    public boolean isWhite() {
        return Color.isWhite(color);
    }
}
