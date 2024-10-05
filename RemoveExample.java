package Collection.CollectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class RemoveExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Apple");
        collection.add("Banana");

        boolean removed = collection.remove("Banana");
        System.out.println("Collection after removal: " + collection + ", Was removed: " + removed);
    }
}
