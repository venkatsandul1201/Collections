package Collection.CollectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class ToArrayExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Apple");
        collection.add("Banana");

        Object[] array = collection.toArray();
        System.out.print("Array elements: ");
        for (Object element : array) {
            System.out.print(element + " ");
        }
    }
}

