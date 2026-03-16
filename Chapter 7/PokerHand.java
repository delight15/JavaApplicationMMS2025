import java.util.HashMap;

public class PokerHand {

    public static boolean isPair(Card[] hand) {

        HashMap<String,Integer> count = new HashMap<>();

        for(Card card : hand) {

            String face = card.getFace();
            count.put(face, count.getOrDefault(face,0)+1);
        }

        for(int value : count.values())
            if(value == 2)
                return true;

        return false;
    }

    public static boolean isThreeOfKind(Card[] hand) {

        HashMap<String,Integer> count = new HashMap<>();

        for(Card card : hand) {

            String face = card.getFace();
            count.put(face, count.getOrDefault(face,0)+1);
        }

        for(int value : count.values())
            if(value == 3)
                return true;

        return false;
    }

    public static boolean isFourOfKind(Card[] hand) {

        HashMap<String,Integer> count = new HashMap<>();

        for(Card card : hand) {

            String face = card.getFace();
            count.put(face, count.getOrDefault(face,0)+1);
        }

        for(int value : count.values())
            if(value == 4)
                return true;

        return false;
    }

    public static boolean isFlush(Card[] hand) {

        String suit = hand[0].getSuit();

        for(Card card : hand) {

            if(!card.getSuit().equals(suit))
                return false;
        }

        return true;
    }
}