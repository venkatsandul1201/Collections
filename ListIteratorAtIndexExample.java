package Collection.ListInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorAtIndexExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // Get list iterator starting at index 1
        ListIterator<String> iterator = list.listIterator(1);
        System.out.print("List elements starting at index 1: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}

