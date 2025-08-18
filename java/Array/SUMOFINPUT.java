import java.util.Scanner;

public class SUMOFINPUT {
    public static class addition {
        public void sum(int x) {
            for (int i = 0; i < x; i++) {
                System.out.println("the output is : " + i);
            }
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        addition obj = new addition();
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <= arr.length; i++) {
            System.out.println("Enter the " + i + "th Element:");
            arr[i] = sc.nextInt();
        }

        // System.out.println("Enter a Number:");
        // int m = sc.nextInt();
        obj.sum(n);
    }
}
