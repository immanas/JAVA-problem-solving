import java.util.Scanner;
public class ThreeAgeGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Age:");
        int age = sc.nextInt();
        if ( age<=12) {
            System.out.println("The guy is child");
        }
        else if (age>12 && age<18) {
            System.out.println("THE Guy is Teenager");
            
        }
        else{
            System.out.println("The Guy is Adult");
        }
    }
}
