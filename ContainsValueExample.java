package Collection.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class ContainsValueExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        
        boolean hasValue2 = map.containsValue(2);
        System.out.println("Contains value 2: " + hasValue2);
    }
}

