import java.util.Scanner;

public class PrintingPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row Number: ");
        int m = sc.nextInt();

        System.out.println("Enter Column  Number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

}
