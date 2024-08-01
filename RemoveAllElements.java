7. Write a Java program to remove all elements from a hash set.
--------------------------------------------------------------------------------

import java.util.HashSet;

public class RemoveAllElements {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Removing all elements
        set.clear();
        System.out.println("Set after clearing: " + set);
    }
}