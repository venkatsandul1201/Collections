package Collection.MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntrySetExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("Map entries: " + entries);
    }
}

