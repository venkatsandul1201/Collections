package Collection.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class GetMapValueExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);

        int value = map.get("Apple");
        System.out.println("Value associated with 'Apple': " + value);
    }
}
