4. Write a Java program to replace the second element of an ArrayList with the specified element.
---------------------------------------------------------------------------------------------------------------------------

import java.util.ArrayList;

public class ReplaceSecondElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");

        // Replacing the second element
        list.set(1, "Replaced");
        System.out.println("Modified list: " + list);
    }
}