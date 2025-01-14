package sreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/** Clase de ejemplos con streams */
public class StreamsExamples {

  /**
   * Método main con ejemplos de streams
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    // Filtrado de personas
    List<Person> people = Arrays.asList(new Person("Lucas", 20), new Person("Maria", 31), new Person("Isabel", 40),
        new Person("Juan", 10), new Person("Alberto", 35));

    people.stream().filter(p -> p.age() >= 18).limit(3).forEach(System.out::println);

    // Stream de nº primitivos int
    System.out.println(IntStream.range(0, 10).boxed().collect(Collectors.toList()));

    // Máximo y mínimo
    List<Integer> numbers = Arrays.asList(5, 6, 89, 90, 88, 56, 100);
    int min = numbers.stream().min(Comparator.naturalOrder()).orElse(-1);
    int max = numbers.stream().max(Comparator.naturalOrder()).orElse(-1);

    System.out.printf("Min: %d, Max: %d%n", min, max);

    // Eliminar duplicados
    List<Integer> numbersDuplicated = Arrays.asList(6, 6, 6, 90, 88, 56, 100);
    System.out.println(numbersDuplicated.stream().distinct().toList());
    System.out.println(numbersDuplicated.stream().collect(Collectors.toSet()));

    // map
    System.out.println(people.stream().map(Person::name).toList());

  }

}
