public class DemoMethod {
  public static void main(String[] args) {
    // function / method
    // why do we need a method?
    // - we can reuse it in a program
    // - system more consistent
    // - we can use it in different projects in the future


    int x = 10;
    int y = x + 3; // f(x) = y
    System.out.println(y); // 13

    // ! Method caller
    int result = sum(50, 99);
    System.out.println("result is " + result);

    // -3 + 99
    // 100 + 20000
    System.out.println("result2 is " + sum(-3, 99));
    System.out.println("result3 is " + sum(100, 20000));

    // "abcde" + "xyz"
    System.out.println("String length is " + stringLength("abcde", "xyz"));

    System.out.println(checkNumber(8));

    // Testing
    System.out.println("Sum of string length is " + stringLength("hello", "Leo")); // 8
    int[] arr = new int[] {100, -4, 999, 40};
    System.out.println("Max is " + findMax(arr)); // 999

    String[] names = new String[] {"Allen", "Steven", "Jennie"};
    System.out.println(countLL(names));




  }
  // method
  // 1. sum -> method name
  // 2. (int x, int y) -> parameter with type, function 入口
  // 3. int -> return type (出口類型)
  public static int sum(int x, int y) {
    int result = x + y;
    return result;
  }

  // Design Method: Given 2 strings, sum up their length, and return it
  public static int stringLength(String stringA, String stringB) {
    int totalLength = stringA.length() + stringB.length();
    return totalLength;
  }

  // Design Method: Given a String value, check if its length > 10, return true/false
  public static boolean lengthCheck(String stringC){
  //   if (stringC.length() > 10){
  //     boolean result;
  //     result = true;
  //   } else {
  //     result = false;
  //   }
  //   return result;
  // }
    return stringC.length() > 10;
  }

  // Design Method: Given an int value, if it is odd number, return this number * 2;
  // If it is even number, return this number * 3
  public static int checkNumber (int intValue){
    // int result;
    // if (intValue % 2 == 1) {
    //   result = intValue * 2;
    // } else {
    //   result = intValue * 3;
    // }
    // return result;
    return intValue % 2 == 1 ? intValue * 2 : intValue * 3;
  }

  // Design Method: Given an int array, find and return the max value of it
  public static int findMax (int[] intArray) {
    int max = intArray[0];
    for (int i = 1; i < intArray.length; i++) {
      // if (intArray[i] > max) {
      //   max = intArray[i];
      max = Math.max(intArray[i], max);
      
    }
    return max;
  }
  // Design Method: Given a String array, count the number of String value that contain "ll"
  public static int countLL(String[] arr) {
    // int count = 0;
    // for (int i = 0; i < arr.length; 1++){
    //   if(arr[i].contains("ll")) {
    //     count++;
    //   }
    // }
    // return count;
    int count = 0;
    for (String s: arr){
      if(s.contains("ll")) {
        count++;
      }
    }
    return count;
  }
    
  


  




}
