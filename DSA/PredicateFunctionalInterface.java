
import java.util.List;

/*
    * A Predicate is a functional interface that takes one argument and returns a boolean value.
    * It is often used for filtering collections or validating conditions.
    * The Predicate interface is part of the java.util.function package and is commonly used in Java Streams.
    * It can be implemented using lambda expressions or method references.
    * The test method is the abstract method of the Predicate interface, which takes an argument and returns a boolean.
 */

public class PredicateFunctionalInterface {

    public static void main(String[] args) {
        // Predicate<Integer> predicate = t -> t > 10;
        // System.out.println(predicate.test(15)); // Output: true
        // System.out.println(predicate.test(5));  // Output: false

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        list.stream().filter(t -> t > 2).forEach(t -> System.out.println(t)); // Output: 3 4 5
    }
}
