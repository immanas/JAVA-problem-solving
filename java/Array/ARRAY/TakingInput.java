package ARRAY;

import  java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i = 0; i<n; i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.println("The Elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]*2);
        }
        }
    }
