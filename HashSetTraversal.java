1.    Write a program to traverse(or iterate) HashSet?
-----------------------------------------------------------------------

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTraversal 
{
    public static void main(String[] args) 
    {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Using Iterator
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) 
        {
            System.out.println(iterator.next());
        }

        // Using for-each loop
        for (String fruit : set) 
        {
            System.out.println(fruit);
        }
    }
}