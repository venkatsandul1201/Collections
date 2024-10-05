package Collection.SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class SubSetExample {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Grapes");

        // Get the subset between "Banana" and "Mango"
        SortedSet<String> subSet = set.subSet("Banana", "Mango");
        System.out.println("SubSet (between Banana and Mango): " + subSet);
    }
}

