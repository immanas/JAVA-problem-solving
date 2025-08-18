import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("ENTER YOUR LUCKY NUM:");
        int num = Sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is Even");
            
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
