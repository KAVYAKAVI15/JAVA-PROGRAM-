2. Write a Java program to retrieve, but not remove, the last element of a linked list
--------------------------------------------------------------------------------------------------------

import java.util.LinkedList;

public class LinkedListLastElement {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");

        // Retrieving the last element
        String lastElement = list.getLast();
        System.out.println("Last element: " + lastElement);
    }
}