package ARRAY;

import java.util.Scanner;

public class CountthenumStrictlyGreater {
    public static int countt(int[] arr, int x){
        int n = arr.length;
        int count = 0;
        boolean found = false;
        for (int i = 0; i < n; i++){
            if (found && arr[i] > x){
                count++;
            }
            if (arr[i] == x){
                found = true;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of x : ");
        int x = sc.nextInt();
        int b = countt(arr, x);
        System.out.println("The Greater number is : "+b);

    }
}
