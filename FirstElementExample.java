package Collection.SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class FirstElementExample {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");

        // Get the first element
        String firstElement = set.first();
        System.out.println("First element: " + firstElement);
    }
}
