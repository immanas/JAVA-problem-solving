package ARRAY;

public class SwapElements {
    public static void swap(int[] a){
        int temp = a[0];
         a[0] = a[1];
         a[1] = temp;
    }
    public static void main(String[] args) {

        int[] a = {10, 12};
        System.out.println("Two elements are :" +a[0] + " " +a[1]);
        swap(a);
        System.out.println(a[0]+" "+a[1]);
    }
}