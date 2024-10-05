package Collection.CollectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class IsEmptyExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        boolean isEmpty = collection.isEmpty();
        System.out.println("Collection is empty: " + isEmpty);
    }
}

