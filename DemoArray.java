import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    // The way to store value: 8 Primitives, 8 wrapper classes, 1 string (17 types)
    // New way to store a set of same type of value == array
    int[] arr = new int[4];

    // assign values into an array
    arr[0] = 100;
    arr[1] = 70;
    arr[2] = 2_100_000_000;
    arr[3] = -200;

    // ! ArrayIndexOutOfBound
    // arr[-1] = -200;
    // arr[4] = 200;

    // for loop to read array
    for (int i=0; i<4; i++){
      System.out.println(arr[i]); // 0,1,2,3
    }

    // long array, with length 3
    long[] arr1 = new long[3];
    // 99
    arr1[0] = 99L;
    // 5
    arr1[1] = 5L;
    // 45
    arr1[2] = 45L;

    // print even numbers in arr2
    for (int i = 0; i < 3; i++) {
      if (arr1[i] % 2 == 0) {
        System.out.println(arr1[i]);
      }
    }
    System.out.println(arr1.length); // 3

    // boolean array, with length 4
    // false
    // true
    // false
    // true

    boolean[] arr2 = new boolean[4];
    arr2[0] = false;
    arr2[1] = true;
    arr2[2] = false;
    arr2[3] = true;

    // for loop -> count number of false
    int falseCounter = 0;
    for (int i = 0; i < 4; i++) {
      if (arr2[i] == false) {
        falseCounter++;
      }
    }
    System.out.println("number of falses is " + falseCounter);

    int[] arr4 = new int[5];
    arr4[0] = 10;
    arr4[1] = -4;
    arr4[2] = 90;
    arr4[3] = 100;
    arr4[4] = -20;
    int max = arr4[0];
    for(int i = 0; i < arr4.length; i++){
      if(arr4[i] > max) {
        max = arr4[i];
      }
    }
    System.out.println("Maximum number is " + max); //100

    // find the index of the max value
    // find the minimum value
    int maxIndex = 0;
    int min = arr4[0];
    for(int i = 0; i < arr4.length; i++){
      if(arr4[i] > max) {
        max = arr4[i];
        maxIndex = i;
      } else if (arr4[i] < min) {
        min = arr4[i];
      }
    }    
    System.out.println("Index with maximum is " + maxIndex); //3
    System.out.println("Minimum number is " + min); // -20

    // String[]
    String[] names = new String[3];
    // John
    // Jennie
    // Steve
    names[0] = "John";
    names[1] = "Jennie";
    names[2] = "Steve";
    for (int i = 0; i < names.length; i++) {
      System.out.println("Your name is " + names[i]);
    }

    // loop: Find name starts with J, print their name
    // startWith()
    // names -> Array
    // names[i] -> String
    for (int i = 0; i < names.length; i++) {
      if (names[i].startsWith("J")){
        System.out.println("Name starting with 'J' is " + names[i]);
      }
    }
    // Loop: Find the names with substring "nn"
    // contains()
    for (int i = 0; i < names.length; i++) {
      if (names[i].contains("nn")) {
        System.out.println("Name with substring \"nn\" is " + names[i]);
      }
    }
    for (int i = 0; i < names.length; i++) {
      if (names[i].indexOf("nn") != -1) {
        System.out.println("Name with substring \"nn\" is " + names[i]);
      }
    }

    // charAt
    // Loop: Find the index of 'e' for each name, put them an array.
    
    int eCount = 0;

    for (int i = 0; i < names.length; i++) { // Loop Every String (i)
      for (int j = 0; j < names[i].length(); j++) { // Loop Every Character in a String (j)
        if (names[i].charAt(j) == 'e') {
          eCount++;
        }
      }
    }
    int[] arr10 = new int[eCount];
    int idx = 0;
    for (int i = 0; i < names.length; i++) { // Loop Every String (i)
      for (int j = 0; j < names[i].length(); j++) { // Loop Every Character in a String (j)
        if (names[i].charAt(j) == 'e') {
          arr10[idx] = j;
          idx++;
          // or arr10[idx++] = j;, ie post increment
        }
      }
    }
    // ! Print an Array -> Arrays.toString()
    System.out.println(Arrays.toString(arr10)); // [1, 5, 2, 4]

    // search + count
    String n1 = "Mandy";
    // Count the number of 'd'
    int dCount = 0;
    for (int i = 0; 1 < n1.length(); i ++){
      if(n1.charAt(i) == 'd'){
        dCount++;
      }
    }
    System.out.println(dCount);

    

  }
}
