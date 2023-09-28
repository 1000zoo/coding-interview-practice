package chapter07_Object_Oriented_Programming.Prob08;

public enum Color {
    WHITE,
    BLACK;

    public static Color getOpposite(Color color) {
        return isWhite(color) ? BLACK : WHITE;
    }

    public static boolean isWhite(Color color) {
        return color == WHITE;
    }
}
