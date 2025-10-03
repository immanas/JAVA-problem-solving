package ARRAY;
import java.util.*;
public class OddEvenMuliply {
    public static void calculate(int[] arr){
        int n = arr.length;
        for (int i =0; i<n; i++){
            if (i%2 == 0) {
                System.out.println("the even elements are : "  +arr[i]*2);
            }
            else System.out.println("the odd elements are  " +(arr[i] + 10));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int a = arr.length;
        System.out.println("Enter the elements : ");
        for (int i = 0; i<a; i++){
            arr[i]  = sc.nextInt();
        }
        calculate(arr);
    }
}
