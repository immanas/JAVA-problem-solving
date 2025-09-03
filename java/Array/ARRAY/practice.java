package ARRAY;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x : ");
        int x = sc.nextInt();
        System.out.println("Enter the Array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        //Searching the X in array
        for (int i =0;i<n; i++){
            if (arr[i] == x ){
                x = arr[i];
                System.out.println("The element is  : "+x);
                System.out.println("The index is  : "+i);
                break;
            }
            else if (arr[i] != x) {
                System.out.println("The x value is not exist in array"+ -1);
                break;
            }


        }

    }
}
