import java.util.Scanner;
public class divisibleby5 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.println("Enter the number :");
        int n = sc.nextInt();

        if (n%5==0) {
            System.out.println("THE NUMBER IS DIVISIBLE BY 5");
        }
        else{
            System.out.println("The Number is not divisible by 5");
        }
    }
    
}
