package Collection.CollectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class RemoveAllExample {
    public static void main(String[] args) {
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("Apple");
        collection1.add("Banana");
        collection1.add("Mango");

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Banana");
        collection2.add("Mango");

        collection1.removeAll(collection2);
        System.out.println("Collection1 after removing all elements of Collection2: " + collection1);
    }
}

