package chapter07_Object_Oriented_Programming.Prob01;

public enum Suit {
    Spade (0), Diamonds (1), Clubs (2), Hearts (3);
    private final int value;
    Suit(int v) {value = v;}
    public int getValue() {return value;}
}
