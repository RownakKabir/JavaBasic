package class7;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Example of a map
        Map<String, Integer> ages = new HashMap<>();

        // Adding key-value pairs to the map
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 35);

        // Accessing values
        System.out.println(ages.get("Bob"));

        // Modifying values
        ages.put("Alice", 26);
        System.out.println(ages);

        // Removing a key-value pair
        ages.remove("Charlie");
        System.out.println(ages);


    }
}

