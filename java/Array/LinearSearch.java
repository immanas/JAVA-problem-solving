package ARRAY;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number x: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int x = 6;
        boolean flag = false;
        System.out.println("Enter the elements:");
        for(int i= 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        //int min = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if (arr[i] == x) {
                flag = true; //mil gaya
                break;
            }

        }
        if (flag == false){
            System.out.println("nahi mila ");
        }
        else System.out.println("mil gaya ");
    }

}
