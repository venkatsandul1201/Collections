package Collection.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class IsEmptyMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        boolean isEmpty = map.isEmpty();
        System.out.println("Map is empty: " + isEmpty);

        map.put("Apple", 1);
        isEmpty = map.isEmpty();
        System.out.println("Map is empty after adding an entry: " + isEmpty);
    }
}
