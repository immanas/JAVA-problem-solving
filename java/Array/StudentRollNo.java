package ARRAY;
import java.util.Scanner;

public class StudentRollNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter  student marks Numbers ");
        for(int i = 1; i<n; i++ ){
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (arr[i]<35) {
                System.out.println("Roll NO is " + i);
            }
            }
        }
    }
