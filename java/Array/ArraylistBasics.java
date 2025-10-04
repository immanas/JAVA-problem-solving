package ARRAY;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistBasics {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(24);
        arr.add(25);
        System.out.println(arr);
        arr.set(2,34);
        System.out.println(arr);
        arr.remove(arr.size()-1);
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);
    }
}
