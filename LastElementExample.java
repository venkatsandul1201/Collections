package Collection.SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class LastElementExample {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");

        // Get the last element
        String lastElement = set.last();
        System.out.println("Last element: " + lastElement);
    }
}

