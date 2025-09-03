package ARRAY;

import java.util.Scanner;

public class ArrayManipulation2 {
    public static int manipulation(int[] arr){
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        //Finding the largest
        for (int i =0; i<n; i++){
            if (arr[i] > max){
                max = arr[i];
            }

        }
        int secondmax = Integer.MIN_VALUE;
        //Finding the second largest
        for (int i =0; i<n; i++){
            if (max != arr[i]){
                secondmax = arr[i];
            }

        }
        return secondmax;

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
        //System.out.println("Enter the value of  : ");
        //int target = sc.nextInt();
        int a = manipulation(arr);
        System.out.println("The second largest element  : " +a);
    }
}
