import java.util.Scanner;
public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: "); //1,4,8,16.....
        int n = sc.nextInt();

        int a = 1;
        for(int i = 1; i<=n; i++){
            System.out.println(a);
            a = a*2;
        }
    }
}
