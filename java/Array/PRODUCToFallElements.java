import java.util.Scanner;;

public class PRODUCToFallElements {
    public static class multiplication {
        public void product(int x) {
            int p = 1;
            for (int i = 1; i < ; i++) {

                p = p * i;
            }
            System.out.println("The product of all elements is: " + p);
        }

    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        multiplication obj = new multiplication();
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + i + " element");
            arr[i] = sc.nextInt();
        }
        obj.product(n);
    }
}
