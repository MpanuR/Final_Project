import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand;
    private int score;
    private String name;

    // player constructor to create a new player
    public Player(String playerName) {
        hand = new ArrayList<>();
        score = 0;
        name = playerName;
    }

    public void describe() {
        System.out.println("Player: " + name);
        System.out.println("Hand: ");
        // initialize players hands
        for (int i = 0; i < hand.size(); i++) {
            // create card object to form a list of cards in players hand
            Card card = hand.get(i);
            card.describe();
        }
        System.out.println("Score: " + score);

    }

    public void draw(Deck deck) {
        // assigning card object to a deck object of cards to draw
        Card card = deck.draw();

        if (card != null) {
            hand.add(card);
        }
    }

    // returns card object
    public Card flip() {

        // if hand list is empty
        if (hand.isEmpty()) {
            return null;
        }
        // get first card in hand assign it to card variable and remove it from hand
        Card card = hand.get(0);
        hand.remove(0);
        return card;
    }

    // increase score by one
    public void incrementScore() {

        score++;

    }

    // get the score for each player
    public int getScore() {
        return score;
    }

}
