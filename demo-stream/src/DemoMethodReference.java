import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class DemoMethodReference {
  public static void main(String[] args) {
    String s = "hello";

    // ! 1. instance method without parameter
    // Lambda
    Supplier<Integer> stringLengthSupplier = () -> s.length(); // diff to s.length()
    System.out.println(stringLengthSupplier.get()); // 5

    // Method Reference
    Supplier<Integer> stringLengthSupplier2 = s::length; // "() -> s.length()", diff to s.length()
    System.out.println(stringLengthSupplier2.get()); // 5

    // ! 2. instance method with parameter
    // BiFuntion (Comparator)

    // Lambda
    Comparator<String> compareStringFunction = (s1, s2) -> s1.compareToIgnoreCase(s2);
    System.out.println(compareStringFunction.compare("apple", "cat")); // -2, left compares to right, left is smaller

    // Method Reference
    Comparator<String> compareStringFunction2 = String::compareToIgnoreCase;
    System.out.println(compareStringFunction2.compare("lion", "apple")); // 11

    // ! 3. Constructor
    // Creat Object (new)

    // Lambda
    BiFunction<String, Integer, Cat> createCatMachine = (name, age) -> new Cat(name, age);
    Cat c1 = createCatMachine.apply("John", 3);

    // Method Reference
    BiFunction<String, Integer, Cat> createCatMachine2 = Cat::new; // OK
    Cat c2 = createCatMachine.apply("John", 3);

    // ! 4. Static method
    // Static method
    List<Integer> integers = new ArrayList<>(List.of(10, 5, 100, -4));
    // Lambda
    integers.forEach(e -> System.out.println(e));
    // Method Reference
    integers.forEach(System.out::println);

  }
}
