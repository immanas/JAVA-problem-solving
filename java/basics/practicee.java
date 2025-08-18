import java.util.Scanner;

public class practicee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of r:");
        float r = sc.nextFloat();

        float v = (float)((4.0 / 3.0) * 3.14 * r * r * r);
        System.out.println("The volume of circle is :" +v);
    }
}