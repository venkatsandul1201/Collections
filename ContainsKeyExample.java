package Collection.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class ContainsKeyExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        
        boolean hasBanana = map.containsKey("Banana");
        System.out.println("Contains key 'Banana': " + hasBanana);
    }
}