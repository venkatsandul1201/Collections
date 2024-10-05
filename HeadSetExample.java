package Collection.SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class HeadSetExample {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");

        // Get the headSet (elements less than "Mango")
        SortedSet<String> headSet = set.headSet("Mango");
        System.out.println("HeadSet (less than Mango): " + headSet);
    }
}

