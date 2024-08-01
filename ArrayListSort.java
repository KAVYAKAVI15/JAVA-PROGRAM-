3. Write a Java program to sort a given array list
----------------------------------------------------------------

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Cat");
        list.add("Dog");
        list.add("Lion");

        // Sorting the list
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
    }
}