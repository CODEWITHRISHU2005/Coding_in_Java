
import java.lang.module.FindException;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_API {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);
        int ans = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);

        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10).map(t -> t[0])
                .forEach(t -> System.out.println(t)); // fibonacci sequence

        Stream.iterate(1000.0, amt -> amt * 1.05) // 5% growth per year
                .limit(10)
                .forEach(System.out::println);

        Stream.generate(() -> new Random().nextInt(9000) + 1000)
                .limit(5)
                .forEach(System.out::println); // Random OTP generator

        Map<String, ?> result = order.stream()
                .collect(Collectors.teeing(
                        Collectors.summingDouble(Order::getTotal), // First Collector
                        Collectors.averagingDouble(Order::getTotal), // Second Collector
                        (sum, avg) -> Map.of("total", sum, "average", avg) // Merge Logic   
                ));

        // @OneToOneMapping
        List<String> emails = customer.stream()
                .map(customer -> customer.getEmail())
                .collect(Collectors.toList());

        // @OneToManyMapping
        List<String> phones = customer.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());

        nums.stream()
                .takeWhile(num -> num < 5)
                .forEach(System.out::println);

        nums.stream()
                .dropWhile(num -> num > 5)
                .forEach(System.out::println);

        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(4, 5, 6);
        Stream<Integer> combinedStream = Stream.concat(stream1, stream2);
        combinedStream.forEach(System.out::println);

        IntStream.range(1, 20).forEach(System.out::println);
        IntStream.rangeClosed(1, 20).forEach(System.out::println);

        Map<String, List<String>> deptToNames = Employee.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept, // Grouping Key
                        Collectors.mapping(Employee::getName, // Extract Value
                                Collectors.toList())));                         // Collect into List

        Map<Boolean, List<String>> nameMap = Employee.stream()
                .collect(Collectors.partitioningBy(
                        e -> e.getSalary() > 100000, // Predicate
                        Collectors.averagingDouble(Employee::getSalary) // Downstream aggregation
                ));

        String numString = nums.stream()
                .collect(Collectors.joining(", ", "[", "]"));
        // Output: "[4, 5, 7, 3, 2, 6]"

        IntSummaryStatistics stats = nums.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));
        // Output: IntSummaryStatistics{count = 6, sum = , min = 2, avg = , max = 7}

        Long employeeResult = empoloyee.stream()
                .mapToDouble(Employee::getSalary)
                .boxed()
                .collect(Collectors.collectingAndThen(
                        Double::doubleValue,
                        Math::round
                ));

        Map<Integer, Integer> map = nums.stream()
                .collect(Collectors.toMap(Function.identity(), value -> value * 2));
        // Output: [4->8, 5->10, 7->14, 3->6, 2->4, 6->12]

        List<String> name = Collections.nCopies(5, "Rishu");

        System.out.println(Collections.frequency(nums, 4));

        // Important for Map element -> freq
        Map<Integer, Integer> m = nums.stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        number -> Collections.frequency(nums, number)
                ));
        
        // Important for Map element -> freq
        Map<Integer, Long> map1 = nums.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        boolean isdisjoint = Collections.disjoint(List.of(1, 2, 3, 4, 5), List.of(2, 3, 7, 8)); // false

        Set<String> set = Collections.singleton("Rishu");

        Collections.rotate(nums, 3); // [3, 2, 6, 4, 5, 7); rotate from right from pos 3
        Collections.rotate(nums, -3); // rotate from left from pos 3
    }
}
