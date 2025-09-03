package ARRAY;
import  java.util.Scanner;
public class Problem2 {
    public static int equal(int[] arr, int x){
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i<n; i++){ //first number
            for (int j = i+1; j<n; j++){// second number
                for (int k = j+1; k<n; k++){ //third number
                    if (arr[i] + arr[j] + arr[k] == x){
                        ans++;
                    }
                }
            }

        }
        return ans;
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
        System.out.println("Enter the value of target : ");
        int target = sc.nextInt();
        int a = equal(arr, target);
        System.out.println("The total  pairs are: " +a);
    }
}
