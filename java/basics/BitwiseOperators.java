import java.util.Scanner;
public class BitwiseOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int a = sc.nextInt();
        System.out.println("Enter b num:");
        int b = sc.nextInt();
        System.out.println(a|b); //11
        System.out.println(a&b); //8
        System.out.println(~a);
        System.out.println(a>>b);//
        System.out.println(a<<b); //
    }
    
}