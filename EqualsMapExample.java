package Collection.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class EqualsMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Apple", 1);
        map1.put("Banana", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Apple", 1);
        map2.put("Banana", 2);

        boolean isEqual = map1.equals(map2);
        System.out.println("Maps are equal: " + isEqual);
    }
}
