import java.util.Scanner;

public class swap{
    public static class addition{
        public  void swap(int a, int b){
             a = a+b;
             b = a-b;
             a = a-b;
            System.out.println("The value of x is : "+a+ " The value of y:"+b);
            return;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        addition obj = new addition();
        System.out.println("Enter X value:");
        int x = sc.nextInt();
        System.out.println("Enter Y value:");
        int y = sc.nextInt();
        obj.swap(x,y);
        // System.out.println("");
    }

}
