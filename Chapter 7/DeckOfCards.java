import java.util.Random;

public class DeckOfCards {

    private Card[] deck = new Card[52];
    private int currentCard = 0;
    private static final Random randomNumbers = new Random();

    private static final String[] faces =
    {"Ace","Deuce","Three","Four","Five","Six","Seven","Eight",
     "Nine","Ten","Jack","Queen","King"};

    private static final String[] suits =
    {"Hearts","Diamonds","Clubs","Spades"};

    public DeckOfCards() {

        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(
                    faces[count % 13],
                    suits[count / 13]);
        }
    }

    public void shuffle() {

        currentCard = 0;

        for (int first = 0; first < deck.length; first++) {

            int second = randomNumbers.nextInt(52);

            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard() {

        if (currentCard < deck.length)
            return deck[currentCard++];
        else
            return null;
    }
}