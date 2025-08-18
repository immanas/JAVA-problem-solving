import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Year:");
        int n = sc.nextInt();

        if (n % 4 == 0) {
            System.out.println("This year is Leap Year");
        } else {
            System.out.println("This year is  not a Leap year");
        }
    }

}
