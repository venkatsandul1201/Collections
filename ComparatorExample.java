package Collection.SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");

        // Get the comparator, which will be null because natural ordering is used
        Comparator<? super String> comp = set.comparator();
        System.out.println("Comparator: " + comp);  // Output will be null as it uses natural ordering
    }
}
