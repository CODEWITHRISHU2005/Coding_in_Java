
import java.util.function.Supplier;
import java.util.Arrays;
import java.util.List;

public class SupplierFunctionalInterface {

    public static void main(String[] args) {
        // SupplierFunctionalInterface supplier = new SupplierFunctionalInterface();
        // System.out.println(supplier.get()); // Output: Hello, Supplier!

        // Supplier<String> supplier = () -> "Hello, Supplier!";
        // System.out.println(supplier.get());
        List<String> list = Arrays.asList("A", "B", "C");
        System.out.println(list.stream().findFirst().orElseGet(() -> "No elements found"));
    }
}
