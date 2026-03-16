public class PokerTest {

    public static void main(String[] args) {

        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        Card[] hand = new Card[5];

        for(int i = 0; i < 5; i++) {

            hand[i] = deck.dealCard();
            System.out.println(hand[i]);
        }

        if(PokerHand.isPair(hand))
            System.out.println("Hand contains a Pair");

        if(PokerHand.isThreeOfKind(hand))
            System.out.println("Hand contains Three of a Kind");

        if(PokerHand.isFourOfKind(hand))
            System.out.println("Hand contains Four of a Kind");

        if(PokerHand.isFlush(hand))
            System.out.println("Hand contains a Flush");
    }
}