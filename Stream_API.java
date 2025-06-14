
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
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
        System.out.println(ans);

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
        System.out.println(result);

        // @OneToOneMapping
        List<String> emails = customer.stream()
                .map(customer -> customer.getEmail())
                .collect(Collectors.toList());
        System.out.println(emails);

        // @OneToManyMapping
        List<String> phones = customer.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(phones);

        Long employeeResult = empoloyee.stream()
                .mapToDouble(Employee::getSalary)
                .boxed()
                .collect(Collectors.collectingAndThen(
                        Double::doubleValue,
                        Math::round
                ));

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
        System.out.println(deptToNames);

        Map<Boolean, List<String>> nameMap = Employee.stream()
                .collect(Collectors.partitioningBy(
                        e -> e.getSalary() > 100000, // Predicate
                        Collectors.averagingDouble(Employee::getSalary) // Downstream aggregation
                ));
        System.out.println(nameMap);

        String numString = nums.stream()
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(numString); // Results in a string like "[4, 5, 7, 3, 2, 6]"

    }
}
