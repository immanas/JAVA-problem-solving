// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class InverytedHalfPyramidwithnumber {
   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int n = sc.nextInt();

      for(int i = n; i >= 1; --i) {
         for(int j = 1; j <= i; ++j) {
            System.out.print(j);
         }

         System.out.println();
      }

   }
}

