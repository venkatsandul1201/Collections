package Collection.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class RemoveAtIndexExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // Remove element at index 1
        String removedElement = list.remove(1);
        System.out.println("Removed element: " + removedElement);
        System.out.println("List after removal: " + list);
    }
}
