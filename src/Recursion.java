import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("What number do you want to find the factorial of?");
//        System.out.print("Your answer is: " + factorial(sc.nextInt()));
        //fibonacci(10);
        System.out.println(problem2());
    }
    public static int factorial(int x) {
        int answer=x;
        while (x > 1) {
            answer*=x-1;
            x-=1;
        }
        return answer;
    }
    public static void fibonacci(int n){
        int x = 0;
        int y = 1;
        int temp = 0;
        for(int i=0;i<n;i++){
            System.out.print((y+x)+", ");
            temp = y;
            y = y+x;
            x = temp;
        }
    }
    public static int problem2(){
        int x = 0;
        int y = 1;
        int temp = 0;
        ArrayList<Integer> terms = new ArrayList<Integer>();
        while((y+x)<4000000) {
            terms.add(x+y);
            temp = y;
            y = y + x;
            x = temp;
        }
        int sum = 0;
        for(int i : terms){
            if(i%2 == 0){
                sum+=i;
            }
        }
        return sum;
    }

}
