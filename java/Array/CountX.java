package ARRAY;

import java.util.Scanner;

public class CountX {
    public  static int count(int[] arr, int x){
        int n = arr.length;
        int count = 0;
        for (int i=0; i<n; i++){
            if(arr[i] == x){
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x : ");
        int x = sc.nextInt();
        System.out.println("Enter the Array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int b = count(arr , x);
        System.out.println("The Output" + b);
    }
}
