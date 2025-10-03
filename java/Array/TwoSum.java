package ARRAY;

import java.util.Scanner;

public class TwoSum {
    public static void sum(int[] arr, int b){
        boolean found = false; // flag set initially to false
        int n = arr.length;
        for (int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] + arr[j] == b){
                    found = true;  // pair found, set flag true
                    System.out.println("The doublet number are"+arr[i]+ "and " +arr[j]);
                }
            }

        }
        if (!found) {
            System.out.println("No pairs found.");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x : ");
        int x = sc.nextInt();
        System.out.println("Enter the Array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        sum(arr, x);
    }
}
