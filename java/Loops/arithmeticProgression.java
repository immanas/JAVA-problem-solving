import java.util.Scanner;

public class arithmeticProgression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("You entered: " + n);
        int a = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a = a+2;
        }
    }
}
