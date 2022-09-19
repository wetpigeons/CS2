package APElevens;

import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck = new ArrayList<>();
    private int size=0;

    public Deck(String[] ranks, String[] suits, int[] pointValue) {
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck.add(new Card(ranks[i], suits[j], pointValue[i]));
                size++;
            }
        }
    }

    public void print () {
        for (int i = 0; i < size; i++) {
            deck.get(i).print();
        }
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }
    public int size(){
        return size;
    }
    public Card deal(){
        size--;
        return deck.get(size);
    }
    public void shuffle(){
        for(int i=51;i>0;i--){
            int r=random(0,i);
            Card temp = deck.get(i);
            deck.set(i,deck.get(r));
            deck.set(r,temp);
        }
    }
    public int random(int min, int max){
        int range = max-min+1;
        int r=(int)(Math.random()*range)+min;
        return r;

    }
}
