import java.util.Scanner;
public class primeComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int a = 0;
        for(int i = 2; i<=n-1;i++){
            if (n%2==0) {
                a = 1;
                break;
            }
        }
        if(a==0) System.out.println("THE NUMBER IS PRIME");
        else System.out.println("The number is composite");
    }
    
}
