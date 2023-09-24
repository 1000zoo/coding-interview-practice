package chapter07_Object_Oriented_Programming.Prob01;

import java.util.*;

public class Deck {
    public List<Card> cards;

    public Deck() {
        reset();
    }

    public void reset() {
        cards = new ArrayList<>();
        for (int i = 0; i < 52; i++) {
            Suit suit = getSuitByIndex(i);
            int number = (i % 13) + 1;
            cards.add(new Card(number, suit));
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card deal() {
        if (cards.isEmpty()) throw new NullPointerException();
        return cards.remove(0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Card card : cards) {
            sb.append(card).append("\n");
        }

        return sb.toString();
    }

    private Suit getSuitByIndex(int index) {
        if (index / 13 == 0) return Suit.Spade;
        if (index / 13 == 1) return Suit.Diamonds;
        if (index / 13 == 2) return Suit.Clubs;
        if (index / 13 == 3) return Suit.Hearts;
        return null;
    }
}
