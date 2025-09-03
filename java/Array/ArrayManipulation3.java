package ARRAY;

import java.util.Scanner;

public class ArrayManipulation3 {
    public  static  int manipulation(int[] arr){
        int n = arr.length;
        for (int i =0; i<n; i++){ //first number
            for (int j = i+1; j<n; j++){ // second number
                if(arr[i] == arr[j]){ //found
                    return arr[i];
                }

            }

        }
        return  -1;
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
        System.out.println("The first repeted element is  : " +a);
    }
}
