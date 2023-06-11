public class Card {
    private String name;
    private int value;

    public Card(String cardName, int cValue) {
        name = cardName;
        value = cValue;

    }

    public void setName(String cardName) {
        name = cardName;
    }

    public String getName() {
        return name;
    }

    public void setCardValue(int cValue) {
        value = cValue;
    }

    public int getCardValue() {
        return value;
    }

    public void describe() {
        String nameString = name;
        int cardValue = value;

        System.out.println("name of card: " + nameString + " value of card: " + cardValue);
    }

    public static void main(String[] args) {

        Card newCard = new Card("Spades", 10);
        System.out.println(newCard.getCardValue());

        newCard.describe();

    }
}
