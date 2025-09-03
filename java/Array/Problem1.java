package ARRAY;

import java.util.Scanner;

public class Problem1 {
    public  static int equal(int[] arr, int target){
        int n = arr.length;
        int count = 0;
        for (int i =0; i<n ; i++){
            for (int j = i+1; j<n; j++){
                if (arr[i] + arr[j] == target){
                    count++;
                }
            }
        }
        return  count;
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
        System.out.println("Enter the value of target : ");
        int target = sc.nextInt();
        int a = equal(arr, target);
        System.out.println("The total number of pairs are: " +a);
    }
}
