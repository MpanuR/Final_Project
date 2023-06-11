public class App {
    public static void main(String[] args) {
        //
        Deck deck = new Deck();
        Player playerOne = new Player("Player 1");
        Player playerTwo = new Player("Player 2");

        deck.shuffle();
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                playerTwo.draw(deck);
            } else {
                playerOne.draw(deck);
            }
        }

        for (int i = 0; i < 26; i++) {
            Card cardOne = playerOne.flip();
            Card cardTwo = playerTwo.flip();

            if (cardOne.getCardValue() > cardTwo.getCardValue()) {
                playerOne.incrementScore();
            } else if (cardOne.getCardValue() < cardTwo.getCardValue()) {
                playerTwo.incrementScore();
            }
            playerOne.describe();
            playerTwo.describe();
        }

        int finalScorePlayerOne = playerOne.getScore();
        int finalScorePlayerTwo = playerTwo.getScore();

        if (finalScorePlayerOne > finalScorePlayerTwo) {
            System.out.println("Player 1 wins!");

        } else if (finalScorePlayerOne < finalScorePlayerTwo) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a draw!");
        }

    }
}