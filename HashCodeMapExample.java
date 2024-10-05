package Collection.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashCodeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);

        int hashCode = map.hashCode();
        System.out.println("Hash code of map: " + hashCode);
    }
}
