import java.math.BigDecimal;
import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    HashSet<Cat> cats = new HashSet<>();
    cats.add(new Cat("John"));
    cats.add(new Cat("Mary"));
    cats.add(new Cat("Tommy"));

    // ! HashSet is from "Hash" family, most of the method from Hash Data Structure use both equals() & hashCode()
    cats.remove(new Cat("John"));

    System.out.println(cats.size()); // 2, if no override hashCode(), using parent hashCoae -> 3

    System.out.println(cats.contains(new Cat("John"))); // true

    System.out.println(new String("hello").equals(new String("hello"))); // true

    System.out.println(new BigDecimal("1").equals(new BigDecimal("1"))); // true

    // Why do we need HashSet?
    // - avoid duplicated
    // how? using equals() and hashCode()
    
    boolean result = cats.add(new Cat("Tommy"));
    System.out.println(result); // false, because java doesn't allow dulicated items'

    result = cats.add(new Cat("Steven")); // ! HashSet add() -> loop
    System.out.println(result); // true
  }
}
