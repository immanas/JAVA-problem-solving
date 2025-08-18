import java.util.Scanner;
public class SumOfDiogits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum = 1;
        for( int i = 1; i<n; i++){
            int digit = n%10;
            sum = sum + digit;
            n = n/10;
        }
        System.out.println("The sum of digit num is:"+sum);
            
        }
    }

