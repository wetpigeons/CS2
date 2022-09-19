package APElevens;

public class DeckTest {
    public static void main(String[] args){
        String[] ranks = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        int[] pointValues = {1,2,3,4,5,6,7,8,9,10,100,400,1300};
        Deck d = new Deck(ranks,suits,pointValues);
        System.out.println("/n/n/n/n/n/n/n");

        d.shuffle();
        for(int i =0; i<52; i++){
            System.out.println(d.deal().toString());
            System.out.println("Size: " + d.size());
        }
        System.out.println("Is Empty? " + d.isEmpty());
    }
}
