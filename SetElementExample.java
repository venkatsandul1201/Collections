package Collection.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class SetElementExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // Set element at index 1 to "Grapes"
        list.set(1, "Grapes");
        System.out.println("List after setting element at index 1: " + list);
    }
}

