
import java.util.HashMap;
import java.util.Map;

/*
 * HashMap is a part of Java's collection framework and implements the Map
 * interface. It is used to store key-value pairs, where each key is unique and
 * maps to a specific value. HashMap allows null values and one null key. It is
 * not synchronized, meaning it is not thread-safe.
 *
 * HashMap is a good choice when you need to store a large number of key-value
 * pairs and do not care about the order of the elements.
 */
public class HashMaps {

    public static void main(String args[]) {
        // Creating a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Inserting key-value pairs
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Searching for a value
        System.out.println("Alice's age: " + map.get("Alice")); // Output: 25

        // Checking if a key exists
        System.out.println("Contains Bob: " + map.containsKey("Bob")); // Output: true

        // Removing a key-value pair
        map.remove("Charlie");
        System.out.println("After removing Charlie: " + map);

        // Iterating through the HashMap
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        // for (Map.Entry<String, Integer> entry : map.entrySet()) {
        //     System.out.println(entry.getKey() + ": " + entry.getValue());
        // }

        // Clearing the HashMap
        map.clear();
        System.out.println("After clearing the HashMap: " + map);
    }
}
