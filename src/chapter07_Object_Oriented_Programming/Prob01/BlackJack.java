package chapter07_Object_Oriented_Programming.Prob01;

import java.util.ArrayList;
import java.util.List;

public class BlackJack {
    public Deck deck;
    public List<Player> playerList;

    public BlackJack() {
        deck = new Deck();
        playerList = new ArrayList<>();
    }

    public void addPlayer(Player p) {
        playerList.add(p);
    }

    public void startGame() {
        //
    }
}
