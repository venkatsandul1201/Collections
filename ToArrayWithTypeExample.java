package Collection.CollectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class ToArrayWithTypeExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Apple");
        collection.add("Banana");

        String[] array = new String[collection.size()];
        collection.toArray(array);

        System.out.print("Typed array elements: ");
        for (String element : array) {
            System.out.print(element + " ");
        }
    }
}

