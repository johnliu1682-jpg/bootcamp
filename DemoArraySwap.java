import java.util.Arrays;

public class DemoArraySwap {
  public static void main(String[] args) {
    int x = 10;
    int y = 7;

    // Swap the value beteen x and y
    int z = x; // backup x
    x = y; // backup y
    y = z;
    System.out.println("x is " + x + " and y is " + y);

    // given int[]
    int[] arr1 = new int[5];
    arr1[0] = 17;
    arr1[1] = 5;
    arr1[2] = -8;
    arr1[3] = 20;
    arr1[4] = 2;

    // Sorting in ascending order
    // 17, 5, -8, 20, 2

    // Find the max value, put it at the tail of the array
    // 5, 17, -8, 20, 2
    // 5, -8, 17, 20, 2
    // 5, -8, 17, 20, 2
    // 5, -8, 17, 2, 20
    // i.e. x, x, x, 2, 20
    int temp = arr1[0];
    for (int j = 0; j < arr1.length - 1; j++) {
      for (int i = 0; i < arr1.length - j - 1; i++) {
        if (arr1[i] > arr1[i+1]) {
          temp = arr1[i];
          arr1[i] = arr1[i+1];
          arr1[i+1] = temp;
        }
      }
    }

    System.out.println(Arrays.toString(arr1)); // [5, -8, 17, 2, 20]

    // Swap
    String name = "Steven";
    // ! String -> char[]
    char[] name2 = name.toCharArray(); // ['S', 't', 'e', 'v', 'e', 'n']
    // nevetS
    // Round 1: swap S and n
    // Round 2: swap t and e
    // Round 3: swap e and v
    char charTemp;
    for (int i = 0; i < name2.length / 2; i++) {
      charTemp = name2[i];
      name2[i] = name2[name2.length - 1 - i];
      name2[name2.length - 1 - i] = charTemp;
    }
    System.out.println(Arrays.toString(name2)); // nevetS
    // ! char[] -> String
    System.out.println(String.valueOf(name2));






  }
}
