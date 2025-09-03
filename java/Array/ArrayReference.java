package ARRAY;

import java.util.Scanner;

public class ArrayReference {
    static void ref(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print( arr[i] + " ");

        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Array Size: ");
        //int a = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " +n+ "Element: ");
        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Array Befor Passing: ");
        for (int i = 0; i<n; i++) {
            System.out.print(arr[i]+ " ");

        }
        ref(arr);
        }
    }
