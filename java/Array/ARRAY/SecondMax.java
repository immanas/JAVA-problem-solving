package ARRAY;

import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter Array elements: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i =0; i<n; i++){
            if (arr[i] > max ){
                max = arr[i];
            }
        }
        System.out.println("The Largest Number is : "+max);
        int smax = Integer.MIN_VALUE;
        for (int i =0; i<n; i++){
            if (arr[i] > smax  && arr[i] != max){
                smax = arr[i];
            }
        }
        System.out.println("The 2nd largest Number is : "+smax);
    }
}
