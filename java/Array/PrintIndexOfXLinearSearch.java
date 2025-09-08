package ARRAY;

import java.util.Scanner;

public class PrintIndexOfXLinearSearch {
    public  static int index(int[] mg, int x){
        int n = mg.length;
        for (int i =0; i< n ; i++){
            if (mg[i] == x){
                x = i; // Return the index
            }
        }
        return  -1; // Return -1 if not found

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
        int b = index(arr, x);
        System.out.println("The index of X in the array :" +b); //after linear search
    }
}
