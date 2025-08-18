package Function;
import java.util.Scanner;

public class Functions {
    public static int sum(int x, int y){
        System.out.println("HII");
        return  x+y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b = sc.nextInt();
        int c = sum(a,b);

        System.out.println(c);
    }
}
