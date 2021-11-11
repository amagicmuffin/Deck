import java.util.ArrayList;

/**
 * a thing
 */
public class Deck {
    private ArrayList<String[]> deck = new ArrayList<String[]>();
    private ArrayList<String[]> discardPile = new ArrayList<String[]>();

    /**
     * creates unshuffled deck
     *
     * the order goes: colored joker, uncolored joker, A->K of Hearts, A->K of Clubs, K->A of Diamonds, K->A of Spades
     **/
    public Deck() {
        // add jokers
        deck.add(new String[]{"Joker", "Colored"});
        deck.add(new String[]{"Joker", "Uncolored"});

        // add hearts
        for(int i = 1; i <= 13; i++) {
            switch (i) {
                case 1:
                    deck.add(new String[]{"Ace", "Hearts"});
                    break;
                case 11:
                    deck.add(new String[]{"Jack", "Hearts"});
                    break;
                case 12:
                    deck.add(new String[]{"Queen", "Hearts"});
                    break;
                case 13:
                    deck.add(new String[]{"King", "Hearts"});
                    break;
                default:
                    deck.add(new String[]{String.valueOf(i), "Hearts"});
                    break;
            }
        }

        // add clubs
        for(int i = 1; i <= 13; i++) {
            switch (i) {
                case 1:
                    deck.add(new String[]{"Ace", "Clubs"});
                    break;
                case 11:
                    deck.add(new String[]{"Jack", "Clubs"});
                    break;
                case 12:
                    deck.add(new String[]{"Queen", "Clubs"});
                    break;
                case 13:
                    deck.add(new String[]{"King", "Clubs"});
                    break;
                default:
                    deck.add(new String[]{String.valueOf(i), "Clubs"});
                    break;
            }
        }

        // add diamonds
        for(int i = 13; i >= 1; i--) {
            switch (i) {
                case 1:
                    deck.add(new String[]{"Ace", "Diamonds"});
                    break;
                case 11:
                    deck.add(new String[]{"Jack", "Diamonds"});
                    break;
                case 12:
                    deck.add(new String[]{"Queen", "Diamonds"});
                    break;
                case 13:
                    deck.add(new String[]{"King", "Diamonds"});
                    break;
                default:
                    deck.add(new String[]{String.valueOf(i), "Diamonds"});
                    break;
            }
        }

        // add spades
        for(int i = 13; i >= 1; i--) {
            switch (i) {
                case 1:
                    deck.add(new String[]{"Ace", "Spades"});
                    break;
                case 11:
                    deck.add(new String[]{"Jack", "Spades"});
                    break;
                case 12:
                    deck.add(new String[]{"Queen", "Spades"});
                    break;
                case 13:
                    deck.add(new String[]{"King", "Spades"});
                    break;
                default:
                    deck.add(new String[]{String.valueOf(i), "Spades"});
                    break;
            }
        }
    }

    /**
     * gets the card in the deck at index
     *
     * @param index     the index number of the card to get
     * @return          a String array two elements large. the first String represents the card number, and the second
     *                  String represents the suit
     */
    public String[] getCard(int index) {
        return deck.get(index);
    }
}