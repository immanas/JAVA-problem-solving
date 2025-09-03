package ARRAY;

import java.util.Scanner;

public class ArrayManipulation {
    public  static  int manipulation(int[] arr ){
       int n = arr.length;
       int man = 0;
       for (int i = 0; i<n; i++){
           for (int j = i+1; j<n; j++){
               if (arr[i] == arr[j]){
                   arr[i] = -1;
                   arr[j] = -1;
               }
           }
       }
       for(int i =0;i<n; i++){
           if (arr[i] > 0){
               man = arr[i];
           }
       }
       return  man;
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
        System.out.println("The unique element is : " +a);
    }
}
