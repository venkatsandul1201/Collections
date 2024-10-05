package Collection.CollectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class RetainAllExample {
    public static void main(String[] args) {
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("Apple");
        collection1.add("Banana");
        collection1.add("Mango");

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Banana");

        collection1.retainAll(collection2);
        System.out.println("Collection1 after retaining elements of Collection2: " + collection1);
    }
}

