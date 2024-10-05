package Collection.CollectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class ContainsAllExample {
    public static void main(String[] args) {
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("Apple");
        collection1.add("Banana");

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Apple");

        boolean containsAll = collection1.containsAll(collection2);
        System.out.println("Collection1 contains all elements of Collection2: " + containsAll);
    }
}

