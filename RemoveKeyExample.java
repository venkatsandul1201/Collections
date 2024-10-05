package Collection.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class RemoveKeyExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);

        // Remove the key 'Banana'
        map.remove("Banana");
        System.out.println("Map after removing 'Banana': " + map);
    }
}
