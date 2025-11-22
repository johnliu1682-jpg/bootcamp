import java.math.BigDecimal;

public class DemoLoopII {
  public static void main(String[] args) {
    // Basic
    for (int i = 0; i < 5; i++) {
      System.out.println("i = " + i);
    }
    for (int i: 5) {
      System.out.println("i = " + i);
    }

    // while loop
    int counter = 0;
    while (counter < 5) {
      System.out.println(counter);
      counter++;
    }

    // Array
    double[] amounts = new double[4];
    amounts[0] = 10.5;
    amounts[1] = 100.9;
    amounts[2] = -24.22;
    amounts[3] = 1010.9;

    // for-each loop (a simple presentation of loop)
    for (double x : amounts){ // ! x is a copy of amount
      System.out.println(x); // read operation
      // x = 100; // ! Wrong idea of write operation
    }
    // basic loop (萬能)
    for (int i = 0; i < amounts.length; i++) {
      System.out.println(amounts[i]); // read operation
      // amounts[i] = 100; // OK, write operation
    }

    // ! Sum up values (important)
    double total = 0.0;
    for (double x : amounts) {
      total = BigDecimal.valueOf(total).add(BigDecimal.valueOf(x)).doubleValue();
      
    }
    System.out.println("total = " + total);




  }
}
