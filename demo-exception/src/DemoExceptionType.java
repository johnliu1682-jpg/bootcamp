import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import javax.imageio.metadata.IIOInvalidTreeException;

public class DemoExceptionType {
  
  public static void main(String[] args) {
    // Example 1: Math
    int count = 0;

    // double average = 10 / count; // we should use if-else to avoid (in real world)
    // try
    try {
      double average = 10 / count;
    } catch (ArithmeticException e) {
      System.out.println("Cannot / by zero");
    }
    
    // System.out.println(average); // java.lang.ArithmeticException: / by zero

    // Example 2: array
    int[] arr = new int[2];
    arr[0] = 100;
    arr[1] = 300;

    int idx = 2;

    try {
      arr[idx] = 1000; // we should use if-else to avoid (in real world)
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array Index Out of Bound.");
    }

    // Example 3
    try {
      String s = "hello";
      s.charAt(s.length()); // we should use if-else to avoid (in real world)
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("String Index Out of Bound.");
    }

    // Example 4: NPE (Null Pointer Exception)
    try {
      //00lastChar("hello"); // OK
      // lastChar(null); // runtime error, NPE
      // lastChar(""); // runtime error, ArrayIndexOutOfBoundsException

    } catch ( NullPointerException e) {
      System.out.println("Null Nointer Exception."); //
    } catch (ArrayIndexOutOfBoundsException e) { // ! else if -> catch
      System.out.println("Array Index Out of Bound.");
    }

    // 5. NumberForException
    Integer x = null;
    Integer x2 = null;
    try {
      x = Integer.valueOf("100");
      x2 = Integer.valueOf("abc"); //error
    } catch (NumberFormatException e) {
      System.out.println("NumberForException." + e.getMessage());
      System.out.println("x=" + x);
      System.out.println("x2=" + x2);
    }
    // 6. IllegalArgumentException (IAE)
    Scanner scanner = null;
    try {
      scanner = new Scanner(System.in);
      System.out.println("Please input the age:");
      int age = scanner.nextInt();
      double fee = calculateFee(age);
    } catch (IllegalArgumentException e) {
      System.out.println("Calculate Fee Process Error: " + e.getMessage());
      // send email to customer
      // fall back stock
      // return debit amount to credit card
    } finally {
      scanner.close();
    }

    // ! Method A -> Method B -> Method C (return type int)

    try {
      // this line tries to find the file.txt in E drive
      // Following file does not exist
      File file = new File("E://file.txt");
      FileReader fr = new FileReader(file);
    } catch (FileNotFoundException e) {
      System.out.println("File does not exist");
    }

  }

  public static double calculateFee(int age) {
    if (age < 0)
      throw new IllegalArgumentException("Age should be >= 0");
    if (age > 65)
      return 2;
    return 10;
  }

  public static char lastChar(String s){
    if (s == null)
      throw new IllegalAccessException("s cannot be null");
    return s.charAt(s.length() - 1);
  }

  



}
