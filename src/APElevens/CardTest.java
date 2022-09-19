package APElevens;

public class CardTest {
    public static void main(String[] args) {
        Card c1 = new Card("King", "Hearts", 10);
        Card c2 = new Card("Five", "Spades", 5);
        Card c3 = new Card("Five", "Spades", 5);

        System.out.println("\f");

        System.out.println("Card 1 rank: " + c1.getRank());
        System.out.println("Card 1 suit: " + c1.getSuit());
        System.out.println("Card 1 value: " + c1.getPointValue());

        System.out.println("Card 2 rank: " + c2.getRank());
        System.out.println("Card 2 suit: " + c2.getSuit());
        System.out.println("Card 2 value: " + c2.getPointValue());

        System.out.println("c1 equals c2; " + c1.equals(c2));
        System.out.println("c2 equals c3; " + c2.equals(c3));

        System.out.println(c1.toString());
        c2.print();
    }
}
