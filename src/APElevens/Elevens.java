package APElevens;

import java.util.ArrayList;
import java.util.Scanner;

public class Elevens {
    public static String[] ranks = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
    public static String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
    public static int[] pointValues = {1,2,3,4,5,6,7,8,9,10,100,400,1300};
    public static Deck d = new Deck(ranks,suits,pointValues);
    public static ArrayList<Card> hand = new ArrayList<Card>();
    public static void main(String[] args){
        System.out.println("/n/n/n/n/n/n/n");
        d.shuffle();
        dealHand();
        printHand();
        chooseCards();
    }
    public static void chooseCards(){
        System.out.println("Would you like to choose 2 or 3 cards?");
        Scanner sc = new Scanner(System.in);
        int response = sc.nextInt();
        if(response ==2){
            chooseTwo();
        }else if(response ==3){
            chooseThree();
        }else {
            chooseCards();
        }
    }

    private static void chooseTwo() {
    }

    private static void chooseThree() {
    }

    public static void dealHand(){
        while(hand.size()<9 && !d.isEmpty()){
            hand.add(d.deal());
        }
    }
    public static void printHand(){
        for(int i=0;i<hand.size();i++){
            System.out.print((i+1)+".) ");
            hand.get(i).print();
        }
    }
}
