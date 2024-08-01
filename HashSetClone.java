6. Write a Java program to clone a hash set to another hash set
-------------------------------------------------------------------------------------

import java.util.HashSet;

public class HashSetClone {
    public static void main(String[] args) {
        HashSet<String> originalSet = new HashSet<>();
        originalSet.add("Apple");
        originalSet.add("Banana");
        originalSet.add("Orange");

        // Cloning the HashSet
        HashSet<String> clonedSet = (HashSet<String>) originalSet.clone();
        System.out.println("Cloned set: " + clonedSet);
    }
}