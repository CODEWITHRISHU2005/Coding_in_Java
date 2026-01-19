
import java.util.List;

/*
 * ConsumerFunctionalInterface is a functional interface that takes an Integer as input
 * and performs an operation on it.
 * It implements the Consumer interface from the java.util.function package.
 * The accept method is overridden to define the operation to be performed on the Integer input.
 * This class can be used to create instances that can process Integer values in a functional style.
 */
public class ConsumerFunctionalInterface {

    public static void main(String[] args) {
        // Consumer<Integer> consumer = t -> System.out.println(t);
        // consumer.accept(10); // Output: 10

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        list.forEach(t -> System.out.println(t)); // Output: 1 2 3 4 5
    }
}

