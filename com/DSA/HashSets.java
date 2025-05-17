
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * HashSet is a part of Java's collection framework and implements the Set
 * interface. It is used to store a collection of unique elements, meaning it
 * does not allow duplicates. HashSet is not ordered, meaning the elements are
 * not stored in any particular order. It allows null values and is not
 * synchronized, meaning it is not thread-safe.
 *
 * HashSet is a good choice when you need to store a large number of unique
 * elements and do not care about the order of the elements.
 */
public class HashSets {

    public static void main(String[] args) {
        // Creaing
        Set<String> set = new HashSet<>();

        // Inserting - add
        set.add("Hello");
        set.add("World");
        set.add("Hello"); // Duplicate, won't be added
        set.add("Java");
        set.add("Python");

        // Search - contains
        System.out.println("Contains 'Java': " + set.contains("Java")); // true
        System.out.println("Contains 'C++': " + set.contains("C++")); // false

        // Remove - remove
        set.remove("Python");
        System.out.println("After removing 'Python': " + set);

        // Size - size
        System.out.println("Size: " + set.size());

        // Printing the HashSet
        System.out.println("HashSet = " + set);

        // Iterating through the HashSet
        Iterator<String> iterator = set.iterator();
        System.out.println("Iterating through HashSet:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Clearing the HashSet
        set.clear();
        System.out.println("After clearing HashSet = " + set);

    }
}
