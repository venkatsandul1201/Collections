package Collection.CollectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class ContainsExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Apple");
        collection.add("Banana");

        boolean contains = collection.contains("Apple");
        System.out.println("Collection contains 'Apple': " + contains);
    }
}

