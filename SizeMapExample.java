package Collection.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class SizeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);

        int size = map.size();
        System.out.println("Size of the map: " + size);
    }
}

