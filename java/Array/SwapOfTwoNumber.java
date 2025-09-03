package ARRAY;

import java.util.Scanner;

public class SwapOfTwoNumber {
    static void swap(int a, int b){
        int temp = a;
         a = b;
         b = temp;
        System.out.println("After swapping two element is :" +a+ "And " +b);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Value Of A: ");
        int a = sc.nextInt();
//        int n = sc.nextInt();
//        int[] arr = new int[n];
        System.out.println("Enter Value Of B : ");
        int b = sc.nextInt();
        System.out.println("before swapping two element is :"+a+ "And " +b);
        swap(a,b);
    }
}
