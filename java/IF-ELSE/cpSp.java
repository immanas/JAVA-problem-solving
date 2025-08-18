import java.util.Scanner;
public class cpSp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER COST PRICE:");
        int cp = sc.nextInt();

        System.out.println("ENTER SELLING PRICE:");
        int sp = sc.nextInt();

        if (sp>cp) {
            System.out.println("SELLER MADE PROFIT");
            
        }
        else if (cp>sp) {
            System.out.println("SELLER MADE LOSS");
        }
        else{
            System.out.println("SELLER MADE NO PROFIT AND NO LOSS");
        }
    }
}
