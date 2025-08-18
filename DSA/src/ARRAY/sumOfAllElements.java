package ARRAY;
import  java.util.Scanner;
public class sumOfAllElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements: ");
        int sum = 0;
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i< n; i++){
            sum += arr[i];
        }
        System.out.println("The sum of Elements is :"+sum);
    }
}
