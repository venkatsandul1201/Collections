package Collection.CollectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class EqualsExample {
    public static void main(String[] args) {
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("Apple");
        collection1.add("Banana");

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Apple");
        collection2.add("Banana");

        boolean isEqual = collection1.equals(collection2);
        System.out.println("Collection1 equals Collection2: " + isEqual);
    }
}

