package Collection.SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class TailSetExample {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Grapes");

        // Get the tailSet (elements greater than or equal to "Banana")
        SortedSet<String> tailSet = set.tailSet("Banana");
        System.out.println("TailSet (from Banana onwards): " + tailSet);
    }
}

