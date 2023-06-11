import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    // create a list of cards from card class
    private List<Card> cards;

    // constructor
    public Deck() {

        // creates a empty arraylist of objects called cards
        cards = new ArrayList<>();
        // array of suits of cards and ranks
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        int[] ranks = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

        // initialize card list to new card objects with each suit and rank value
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                // creates a new card object with current suit and rank
                Card card = new Card(suits[i], ranks[j]);
                // add card object to cards arraylist
                cards.add(card);
            }
        }

    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        if (cards.isEmpty()) {
            System.out.println("No cards left in deck.");
        }
        return cards.remove(0);
    }

}
