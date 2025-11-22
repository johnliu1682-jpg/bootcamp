public class DemoLoop {
  public static void main(String[] args) {
    // flow -> if-else
    // loop (for-loop, while)

    int x = 3;
    x *=3;
    x *=3;
    System.out.println(x);

    // for-loop
    // (initialization, continue criteria; modifier)
    for (int i = 0; i < 3; i++) { // 3 times
      System.out.println("Hello");
    }
    // Step 1: int i = 0
    // Step 2: i < 3 ? Yes
    // Step 3: print hello
    // Step 4: i++ (i=1)
    // Step 5: i < 3 ? Yes
    // Step 6: print hello
    // Step 7: i++ (i=2)
    // Step 8: i < 3 ? Yes
    // Step 9 print hello
    // Step 10: i++ (i=3)
    // Step 11: i < 3 ? No
    // Step 12: Exit loop
  
    // loop -> 0,1,2,3,4,5 -> total=15
    int total = 0;
    for (int j = 0; j < 6; j++) {
      total = total + j; // total += j
    }
    System.out.println(total); // 15

    // for loop + if (1-10, print odd number only)
    for (int i=0; i<11; i++) {
      if (i % 2 == 1) {
        System.out.println(i);
      }
    }

    // sum up all even numbers between 0-20
    total = 0;
    for (int i = 0; i < 21; i++){
      if (i % 2 == 0) {
        total += i;
      }
    }
    System.out.println("total = " + total); // 110

    // 0-100, sum up all number that is divided by 3
    total = 0;
    for (int i = 0; i < 101; i++) {
      if (i % 3 == 0) {
        total += i;
      }
    }
    System.out.println("total = " + total); // 1683

    // 0-50, the difference between the sum of all even number the sum of all odd number
    int oddTotal = 0;
    int evenTotal = 0;
    for (int i=0; i<51; i++){
      if (i % 2 == 0) {
        evenTotal += i;
      } else {
        oddTotal += i;
      }
    }
    System.out.println("Difference = " + (evenTotal - oddTotal)); // 25

    // 0-20, sum up all even numbers; 21-50, sum up all even numbers
    // find the product of both total numbers
    int evenSum = 0;
    int oddSum = 0;
    for (int i = 0; i < 51; i++) { // non-business meaning (the number of times)
      if (i <= 20) { // business meaning, explicit numbers aligns the requirements
        if (i % 2 == 0) {
          evenSum += i;
        }
      } else if (i >= 21 && i <= 50) {
        if (i % 2 == 1) {
          oddSum += i;
        }
      }
    }
    System.out.println("Product = " + (evenSum * oddSum)); // 57750

    // Loop + if + break/continue
    // 1. break
    // searching
    String[] names = new String[] {"John", "Peter", "Sally", "Vincent", "Steven"}; // fixed-length = 4
    // Find the fist name that length > 5
    String targetName = null;
    for (int i = 0; i < names.length; i++) {
      if (names[i].length() > 5) {
        targetName = names[i];
        break; // break the loop
      }
    }
    System.out.println(targetName);

    //🔴🟠🟡🟢🔵🟣🟤

    // Scanner
    // Scanner s = new Scanner(System.in);
    // System.out.printIn("Please input an integer");
    // int input = s.nextInt();
    // int result = input * 3;
    // System.out.println("result=" + result)
    // string array, double array, int array



  }
}
