package Collection.CollectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class SizeExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Apple");
        collection.add("Banana");

        int size = collection.size();
        System.out.println("Collection size: " + size);
    }
}

