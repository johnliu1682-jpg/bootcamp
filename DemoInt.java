public class DemoInt{
  public static void main(String[] args) {
    // You can drop comments/notes by double slash
    // ! Variable and Data Type
    int x = 3;
    // ! int x (declaration)
    // x is a varable name
    // 3 (assignment, assign Value 3 to variable x)
    
    int y = 10;
    System.out.println(y); 

    // declaration
      int a;
      int k;

    // Assignment
    a = 100;
    k = 20;

    int total = x + y;
    System.out.println(total);

    int baseSalary = 20000;
    int bonus = 5000;
    int totalSalary = baseSalary + bonus;
    System.out.println(totalSalary);
    System.out.println(bonus);

    // Naming convension (camel case)


    // discount
    int price = 150;
    double rate = 0.8;

    // ! Math Operation:
    // 1. int + int -> int
    // 2. int + double -> double
    // 3. doublt + int -> double
    // 4. double + double -> double
    // i.e. 1.0 + 4 = 5.0
    // 1 + 4 = 5

    // int * double -> double
    // ! We cannot assign double value int an int variable.
    // int finalPrice = price * discountRate
    double discount = price * rate;
    System.out.println(discount);

    int englishScore = 82;
    int mathScore = 91;
    int historyScore = 83;

    // ! (int + int + int) / int -> int
    // double averageScore = (englishScore + mathScore + historyScore) / 3;
    // System.out.println(averageScore); // 85.0 -> wrong

    double averageScore2 = (englishScore + mathScore + historyScore) / 3.0;
    System.out.println(averageScore2); // 85.33333333333333

    int appleCount = 9;
    double applePrice = 5.5;
    int orangeCount = 4;
    double orangePrice = 6.5;

    double discount2 = 0.95;

    // finalAmount

    double finalAmount = ((appleCount * applePrice) + (orangeCount * orangePrice)) *  discount2;
    System.out.println(finalAmount); // 71.725
  }
}