package ARRAY;

public class ArrangingArrayAccordingEvenOdd {
    public static void print(int[] arr){
        int n= arr.length;
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
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        System.out.println("The Array Is: ");
        print(arr);
        int i=0; int j=n-1;
        while (i<j){
            if (arr[i] % 2 == 0) i++;
            else if (arr[j] % 2 != 0) j--;
            else { swap(arr, i, j); i++; j--; }

        }
        print(arr);
    }
}
