import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProduceStreams {


    public static final List<String> LIST = Arrays.asList("a1", "a2", "b1", "c2", "c1", "c");


    public void fromList() {

        LIST.stream()
                .filter(s -> s.contains("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }


    public void streamOf() {

        Stream.of("a2", "a1", "b3", "b1")
                .sorted()
                .findFirst()
                .map(String::toUpperCase)
                .ifPresent(System.out::println);
    }

    public void intStreamRange() {

        IntStream.range(2, 43)
                .forEach(System.out::println);
    }

    public void arraysStream() {
        Arrays.stream(new int[]{2, 1, 18, 2})
                .map(n -> 2 * n + 1)
                .sorted()
                .distinct()
                .average()
                .ifPresent(System.out::println);
    }

    public void mapToInt() {
        LIST.stream()
                .filter(s -> s.length() > 1)
                .map(s -> s.substring(1))
                .distinct()
                .sorted()
                .mapToInt(Integer::parseInt)
                .forEach(System.out::println);
    }

    public void mapToObject() {
        IntStream
                .range(0, 15)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);
    }

    public void sorting() {
        LIST.stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .forEach(System.out::println);
    }

    public void reusingFail() {
        Stream<String> stream = Stream.of("d2", "a2", "b1", "b3", "c");

        stream.anyMatch(s -> true);
        stream.anyMatch(s -> true);
    }


    public void supplier() {
        Supplier<Stream<String>> supplier = () -> Stream.of("d2", "a2", "b1", "b3", "c");

        supplier.get().anyMatch(s -> s.startsWith("b"));
        supplier.get().noneMatch(s -> s.startsWith("x"));

    }
}
