package ARRAY;
import  java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int m = arr.length;
        for(int i = 0; i< m; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("OUTPUT: ");
        for (int i =0; i<m; i++){
            System.out.println(arr[i] +" ");
        }
    }
}
