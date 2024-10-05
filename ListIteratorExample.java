package Collection.ListInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // Get list iterator
        ListIterator<String> iterator = list.listIterator();
        System.out.print("List elements: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}

