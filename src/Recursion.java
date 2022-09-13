import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What number do you want to find the factorial of?");
        System.out.print("Your answer is: " + factorial(sc.nextInt()));
    }

    public static int factorial(int x) {
        int answer=x;
        while (x > 1) {
            answer*=x-1;
            x-=1;
        }
        return answer;
    }
}
