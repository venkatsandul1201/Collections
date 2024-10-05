package Collection.ClassesEx;

import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Apple", 1);
        hashtable.put("Banana", 2);
        hashtable.put("Mango", 3);

        System.out.println("Hashtable: " + hashtable);
    }
}
