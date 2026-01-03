import java.util.Optional;

public class DemoOptional {
  // ! Optional Method Author: Use Optional to present "not found"
  // ! Optional Method User: Use isPresent()/ifPresent() to chace it the value exists.
  public static void main(String[] args) {
    Integer[] ages = new Integer[] {100, -40, 70, 23};
    Optional<Integer> maxAge = findMaxNumber(ages);
    // ! Use isPresent() to check if the value exists, then you can use get() directly.
    // ! maxAge no longer become null
    if (maxAge.isPresent()) {
      System.out.println("Max age" + maxAge.get());
    } else {
      System.out.println("Not Found");
    }

    if (!maxAge.isPresent()) {

    }

    // Lambda
    maxAge.ifPresent(age -> {
      System.out.println("max age=" + age);
    });

    // Find Food, Search Database, if Found, return option.of(Food), else Optional.empty()
  }

  // searching
  // ! After using Optional design for the method, we don't need to return null value anymore.
  public static Optional<Integer> findMaxNumber(Integer[] numbers) {
    if (numbers == null)
      throw new IllegalAccessException("numbers should not be null.");
    if (numbers.length == 0)
      return Optional.empty();
    // numbers -> null || numbers.length = 0
    int max = numbers[0];
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > max)
        max = numbers[i];
    }
    return Optional.of(max);
  }
}
