package Collection.CollectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class HashCodeExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Apple");
        collection.add("Banana");

        int hashCode = collection.hashCode();
        System.out.println("Collection hash code: " + hashCode);
    }
}

