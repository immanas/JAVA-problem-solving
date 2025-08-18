import java.util.Scanner;
public class AbsoulateValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if (0>n) {
            int a = n*(-1);
            System.out.println("The Absoulate value of this number is :"+a);
        }
        else{
            System.out.println("The Absoulate value of this numbetr is:" +n);
        }
    }
    
}
