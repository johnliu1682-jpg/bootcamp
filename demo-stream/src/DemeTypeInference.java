import java.util.ArrayList;
import java.util.Optional;

public class DemeTypeInference {
  public static void main(String[] args) {
    // Java 10
    int x = 3;
    // ! because x has been defined as int, we cannot the type of x again.
    // x = 3.5;

    // ! Can't do
    // 2. Attribute type
    //private var name;

    var y = 10;
    System.out.println(y);
    var name = "Jenny";
    System.out.println(name);

    var ages = new int[] {10, 3, 9};

    var email = Optional.of("peter@gmail.com");

    var apples = new ArrayList<>();
    // ! "var" supports implicitly original type when initialization (first assignment)
    // ! "value assignment" decides the type of reference.
    // apples = 10; // because "apples" has been defined as "ArrayList" in line 19
    // ! Java is static (compile) and strong (explicit conversion) type language
    int score;
    // var score2;
  }

  // ! Can't do
  // 1. parameter
  //public static int sum(var x, var y) {}

  // 3. Method Return Type
  // public static int sum(int x, int y) {
  //   return 10;
  // }
}
