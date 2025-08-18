import java.util.Scanner;
public class SumofTwoNumber {
    public static class algebra{
        public  int add(int x, int y){
            int addition = x + y;
            return addition;
        }
    }
    
    public static void main(String[] args) {
        algebra obj = new algebra();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A number:");
        int a = sc.nextInt();

        System.out.println("Enter another number:");
        int b = sc.nextInt();

        int sum = obj.add(a,b);
        System.out.println("Sum of two number is "+sum);
        
    }  
}