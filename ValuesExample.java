package Collection.MapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ValuesExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);

        Collection<Integer> values = map.values();
        System.out.println("Values in the map: " + values);
    }
}
