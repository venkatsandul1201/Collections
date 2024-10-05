package Collection.MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeySetExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);

        Set<String> keys = map.keySet();
        System.out.println("Keys in the map: " + keys);
    }
}
