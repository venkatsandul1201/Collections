package Collection.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class GetElementExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // Get element at index 2
        String fruit = list.get(2);
        System.out.println("Element at index 2: " + fruit);
    }
}

