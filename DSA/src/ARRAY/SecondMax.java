package ARRAY;

import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        int max = Integer.MIN_VALUE;
        System.out.println("Enter The Elements:");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i<n; i++){
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i<n; i++){
            if (arr[i] > smax && arr[i] !=max) {
                smax = arr[i];
            }
        }
        System.out.println("THe Maximum Element is :"+max);
        System.out.println("The Second Largest Element is :"+smax);
    }
}
