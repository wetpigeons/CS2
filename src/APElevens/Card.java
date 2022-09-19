package APElevens;

public class Card {
    private String rank;
    private String suit;
    private int pointValue;

    public Card(String rank, String suit, int pointValue){
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }
    public String getRank(){
        return rank;
    }
    public String getSuit(){
        return suit;
    }
    public int getPointValue(){
        return pointValue;
    }
    public boolean equals(Card c2){
        if(this.rank.equals(c2.getRank()) && this.suit.equals(c2.getSuit())){
            return true;
        }
        return false;
    }
    public String toString(){
        return this.rank + " of " + this.suit + " (point value = " + this.pointValue + " )";
    }
    public void print(){
        System.out.println(this.toString());
    }
}
