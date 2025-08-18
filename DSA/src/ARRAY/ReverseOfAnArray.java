package ARRAY;
//import  java.util.Scanner;
public class ReverseOfAnArray {
    public static void PrintArray(int[] arr){
        int n = arr.length;
        for (int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public  static  void    swap(int[] arr,int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;


    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter The array Size:");
        int[] arr= {11,12,34,45,23};
        int n = arr.length;
        System.out.println("Elements Before Reverse: ");
        PrintArray(arr);
        System.out.println("Elements After Reverse: ");
        int i = 0; int j = n-1;
        while (i < j){
           swap(arr,i,j);
           i++;
           j--;
        }
        PrintArray(arr);

    }
}
