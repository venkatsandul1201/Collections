package Collection.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class IndexOfExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // Get index of "Banana"
        int index = list.indexOf("Banana");
        System.out.println("Index of 'Banana': " + index);
    }
}

