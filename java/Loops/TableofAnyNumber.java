import java.util.Scanner;
public class TableofAnyNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number:");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
        int result = n*i;
        System.out.println(n+"x"+i+"=" + result);
           
        }
    }
}

