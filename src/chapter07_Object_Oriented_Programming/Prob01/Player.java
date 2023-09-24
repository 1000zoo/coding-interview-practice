package chapter07_Object_Oriented_Programming.Prob01;

import java.util.*;

public class Player {
    private List<Card> hands;

    public Player() {
        reset();
    }

    public void reset() {
        hands = new ArrayList<>();
    }

    public void addCard(Card card) {
        hands.add(card);
    }

    public int score() {
        // score 계산 로직
        return 0;
    }

    public String toString() {
        return "hands: " + hands + ", score: " + score();
    }
}
