package Collection.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class SubListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Grapes");

        // Get sublist from index 1 to 3 (exclusive)
        List<String> subList = list.subList(1, 3);
        System.out.println("Sublist from index 1 to 3: " + subList);
    }
}

