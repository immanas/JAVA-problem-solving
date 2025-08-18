package ARRAY;

import java.util.Scanner;

public class Maximum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Array Size:");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter The Elements:");
            int max = Integer.MIN_VALUE;
            for (int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for (int i=0; i<n; i++){
                if (arr[i]>max) max = arr[i];

            }

            System.out.println("The Maximum Element from Array is:"+max);
        }
    }

