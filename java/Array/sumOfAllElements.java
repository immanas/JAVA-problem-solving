package ARRAY;
import  java.util.Scanner;
public class sumOfAllElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter Elements: ");
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++){
            sum += arr[i];


        }
        System.out.println("The sum of all elements are: " + sum);
    }
}
