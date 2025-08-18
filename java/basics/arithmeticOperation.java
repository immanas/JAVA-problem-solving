import java.util.Scanner;
public class arithmeticOperation {
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter FIRST num:");
    int num_1 = sc.nextInt();
    System.out.println("Enter SECOND num:");
    int num_2 = sc.nextInt();
    int num_3 = num_1 + num_2;
    int num_4 = num_1 - num_2;
    int num_5 = num_1 * num_2;
    int num_6 = num_1 / num_2;
    System.out.println("sum of two num is:"+num_3);
    System.out.println("substraction of two num is:"+num_4);
    System.out.println("multipication of two num is:"+num_5);
    System.out.println("division of two num is:"+num_6);
   } 
}
