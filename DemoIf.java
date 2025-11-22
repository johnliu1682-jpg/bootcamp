public class DemoIf {
  public static void main(String[] args) {
    int x = 3;
    if (x > 10) {
      System.out.println("hello");
    } else {
      System.out.println("Goodbye");
    }

    if (x >= 4) {
      System.out.println("x is larger than 4"); // skip
    }

    // AND OR
    int y = 10;
    if (x > 2 && y < 20) { // true && true -> true
      System.out.println("hello"); // print
    }

    // Example: max, min
    int num1 = 10;
    int num2 = 12;
    int max = 0;
    int min = 0;
    // print "max=12, min=10"
    if (num1 > num2) {
      max = num1;
      min = num2;
    } else {
      max = num2;
      min = num1;
    }
    System.out.println("max = " + max + ", min = " + min);

    // if-else, if-elseif-else
    // score >= 90, Grade A
    // score >= 80, Grade B
    // score >= 70, Grade C
    // score < 70, Fail
    char grade = 'F';
    int score = 101;
    if (score <= 100 && score >= 90) {
      grade = 'A';
    } else if (score >= 80 && score < 90) { // overlapped is NOT recommanded for beginners
      grade = 'B';
    } else if (score >= 70 && score < 80) {
      grade = 'C';
    } else if (score >= 0 && score < 70) {
      grade = 'F';
    } else {
      grade = 'N';
    }
    System.out.println("Your grade is " + grade);



  }
}
