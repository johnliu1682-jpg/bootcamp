import java.math.BigDecimal;

public class DemoStringBuilder {
  public static void main(String[] args) {
    String name = "John";
    String[] names = new String[] {"Peter", name, "Sally"};

    // "PeterJohnSally"
    String result = "";
    for (String x : names) {
      result = result.concat(x);
    }
    System.out.println(result);

    // StringBuilder
    StringBuilder sb = new StringBuilder();
    sb.append("hello"); // append = 修改自己 without creating new object
    sb.append("world");
    System.out.println(sb.toString()); // helloworld (.toString() was done automatically)

    BigDecimal bd = new BigDecimal("3.5");
    bd = bd.add(BigDecimal.TEN);
    System.out.println(bd);
    
    // ! Performance of String concat (StringBuilder wins!!!)
    long before = System.currentTimeMillis();
    result = "";
    for (int i = 0; i < 100_000; i++) {
      result += "a"; // "a" -> "aa" -> "aaa"
    }
    long after = System.currentTimeMillis();
    System.out.println(after - before); // ~300 ms (0.3 second)

    before = System.currentTimeMillis();
    sb = new StringBuilder();
    for (int i = 0; i < 100_000; i++) {
      sb.append("a");
    }
    after = System.currentTimeMillis();
    System.out.println(after - before); // ~2 ms

    // ! Real Use case, usually concat 2 strings, but not 100 thousands strings...
    String url = "https://www.apple.com";
    url += url + "/products";
    System.out.println(url); // https://www.apple.comhttps://www.apple.com/products


    // Literal Pool
    String s1 = "hello";
    String s2 = "hello"; // ! "hello" -> reuse original string object in string pool
    System.out.println(s1.hashCode()); // 99162322
    System.out.println(s2.hashCode()); // 99162322
    System.out.println(s1 == s2); // true
    
    s1 = new String("hello"); // ! Must create a new String object
    System.out.println(s1 == s2); // false

    s1 = String.valueOf("hello"); // ! Firstly it search string pool,
    System.out.println(s1 == s2); // true


    s1.replace('e', 'x');
    


  }
}