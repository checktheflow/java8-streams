import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvancedStream {

    private static List<Person> PERSONS =
            Arrays.asList(
                    new Person("Max", 18),
                    new Person("Peter", 23),
                    new Person("Pamela", 23),
                    new Person("David", 12));


    public void toList() {
        List<String> namesList = PERSONS.stream()
                .map(person -> person.name.toUpperCase())
                .filter(name -> name.startsWith("P"))
                .collect(Collectors.toList());
        System.out.println(namesList);
    }


    public void groupBy() {
        Map<Integer, List<Person>> ageMap = PERSONS
                .stream()
                .collect(Collectors.groupingBy(p -> p.age));

        System.out.println(ageMap);

        ageMap.forEach((age, p) -> System.out.format("age %s: %s \n", age, p));

    }

    public void summarizeStats() {
        IntSummaryStatistics summaryStatistics = PERSONS
                .stream()
                .collect(Collectors.summarizingInt(p -> p.age));

        System.out.println(summaryStatistics);
    }

    public void stringJoining() {
        String result = PERSONS.stream()
                .filter(person -> person.age >= 18)
                .map(person -> person.name)
                .collect(Collectors.joining(" and ", "persons ", " are of legal age"));
        System.out.println(result);
    }
}
