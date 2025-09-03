package ARRAY;

public class GreaterThanX {
    public static void main(String[] args) {
        int[] sum = {34, 33, 56, 78, 45, 44};
        //System.out.println(" The value of X:");
        int n = sum.length;
        int x = 44;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (sum[i] > x) {
                count++;
            }
        }
        System.out.println("The Number of Element is :" + count);

    }
    }
