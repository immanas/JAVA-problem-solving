 import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num:");
        int num = sc.nextInt();
        String ans;
        ans = (num % 2 == 0) ? "even":"odd";
        System.out.println("ans");
        
        // if (num % 2 == 0) {
            // System.out.println("IT is a Even NO");
        // }
        // else{
            // System.out.println("It is A Odd Num");
        // }
    }
}
