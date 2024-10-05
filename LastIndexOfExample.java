package Collection.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class LastIndexOfExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Banana");

        // Get last index of "Banana"
        int lastIndex = list.lastIndexOf("Banana");
        System.out.println("Last index of 'Banana': " + lastIndex);
    }
}

