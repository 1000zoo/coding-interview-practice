package chapter07_Object_Oriented_Programming.Prob01;

public class Card {
    public int number;
    public Suit suit;    //0: Spade, 1: Diamond, 2: Clover, 3: Heart

    public Card(int number, Suit suit) {
        this.number = number;
        this.suit = suit;
    }

    public int value() {
        return number;
    }

    public int minValue() {
        return isAce() ? 1 : value();
    }

    public int maxValue() {
        return isAce() ? 11 : value();
    }

    public boolean isAce() {
        return number == 1;
    }

    public boolean isFaceCard() {
        assert number <= 13;
        return number >= 11;
    }

    public String toString() {
        return "number: " + number + ", suit: " + suit;
    }
}
