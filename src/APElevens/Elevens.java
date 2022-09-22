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
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        d.shuffle();
        dealHand();
        printHand();
        while(validMove() && hand.size()>0) {
            chooseCards();
            dealHand();
            printHand();
        }
    }
    public static boolean validMove(){
        for(int i=0; i<hand.size()-1;i++){
            for(int j=0;j<hand.size();j++){
                if(j!=i){
                    if(hand.get(i).getPointValue()+hand.get(j).getPointValue()==11){
                        return true;
                    }
                }
            }
        }
        for(int i=0;i<hand.size();i++){
            for(int j=i+1;j<hand.size();j++){
                for(int k=j+1;k<hand.size();k++){
                    if(i!=j && j!=k){
                        if(hand.get(i).getPointValue()+hand.get(j).getPointValue()+hand.get(k).getPointValue() == 1800){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
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
        System.out.println("Enter the number of the first card (1-9)");
        Scanner sc = new Scanner(System.in);
        int card1 = sc.nextInt();
        System.out.println("Enter the number of the second card (1-9)");
        int card2= sc.nextInt();

        if(hand.get(card1-1).getPointValue() + hand.get(card2-1).getPointValue() == 11){
            if(card1>card2){
                hand.remove(card1-1);
                hand.remove(card2-1);
            } else if(card2>card1){
                hand.remove(card2-1);
                hand.remove(card1-1);
            }
            printHand();
        } else {
            System.out.println("Sorry, the cards have to add up to 11.");
            chooseCards();
        }
    }

    private static void chooseThree() {
        System.out.println("Enter the number of the first card (1-9)");
        Scanner sc = new Scanner(System.in);
        int card1 = sc.nextInt();
        System.out.println("Enter the number of the second card (1-9)");
        int card2 = sc.nextInt();
        System.out.println("Enter the number of the third card (1-9)");
        int card3 = sc.nextInt();

        if (hand.get(card1 - 1).getPointValue() + hand.get(card2 - 1).getPointValue() + hand.get(card3).getPointValue() == 1800) {
            if (card1 > card2 && card2 > card3) {
                hand.remove(card1 - 1);
                hand.remove(card2 - 1);
                hand.remove(card3 - 1);
            } else if (card1 > card3 && card3 > card2) {
                hand.remove(card1 - 1);
                hand.remove(card3 - 1);
                hand.remove(card2 - 1);
            } else if (card2 > card1 && card1 > card3) {
                hand.remove(card2 - 1);
                hand.remove(card1 - 1);
                hand.remove(card3 - 1);
            } else if (card2 > card3 && card3 > card1) {
                hand.remove(card2 - 1);
                hand.remove(card3 - 1);
                hand.remove(card1 - 1);
            } else if (card3 > card1 && card1 > card2) {
                hand.remove(card3 - 1);
                hand.remove(card1 - 1);
                hand.remove(card2 - 1);
            } else if (card3 > card2 && card2 > card1) {
                hand.remove(card3 - 1);
                hand.remove(card2 - 1);
                hand.remove(card1 - 1);

            } else {
                System.out.println("Sorry, the cards you selected were not J Q and K");
                chooseCards();
            }
        }
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
