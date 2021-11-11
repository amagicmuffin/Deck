/**
 * Used to test the Deck file
 */

public class DeckTest {
    public static void main(String[] args) {
        System.out.println("yeah this works");

        Deck myDeck = new Deck();
        //System.out.println(myDeck.getCard(5)[0]);

        for(int i = 0; i <= 53; i++) {
            System.out.print(i + " ");
            System.out.print(myDeck.getCard(i)[0]);
            System.out.print(" of ");
            System.out.println(myDeck.getCard(i)[1]);
        }
    }
}
