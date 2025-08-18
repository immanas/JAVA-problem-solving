package Function;
import java.util.Scanner;
public class PermudationCombination {
    public static int per(int a){
        int fact = 1;
        for (int i = 1; i<=a; i++){
            fact *= i;
        }

        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of n:");
        int n = sc.nextInt();
        System.out.println("Enter a value of n:");
        int r = sc.nextInt();
        int nfact = per(n);

        System.out.println("The factorial of n :" +nfact);
        int rfact = per(r);
        System.out.println("The factorial of r :" +rfact);
// Permutation: nPr = n! / (n - r)!
        int permu = nfact / (rfact); // where nfact_rfact = (n - r)!
        System.out.println("The permutation is: " + permu);

// Combination: nCr = n! / (r! * (n - r)!)
        int comb = nfact / (rfact * rfact);
        System.out.println("The combination is: " + comb);


    }
}
