import java.util.Random;

public class DemoPrimitivesII {
  public static void main(String[] args) {
    // ! Overflow
    short s1 = 30000;
    short s2 = 31000;
    short s3 = (short) (s1 + s2); // short + short -> int, byte + byte -> int, byte + short -> int
    System.out.println("s3 = " + s3); // -4536
    // 32xxx -> + 1 -> -32xxx
    // short: [-32,768, 32,767]
    short s6 = (short) (32767 + 1);
    System.out.println("s6 = " + s6); // -

    int i1 = 2_100_000_000;
    int i2 = 100_000_000;
    int i3 = i1 + i2;
    System.out.println(i3); // -2094967296

    // ! Promotion (upcasting)
    // byte -> short -> int -> long -> float -> double
    byte b1 = 10;
    short s10 = b1;
    int i10 = s10;
    long l10 = i10;
    float f10 = l10;
    double d10 = f10; // safe

    // ! downcasting
    //float f1 = (float) 10.5d; // error, double
    //float f1 = 10.5d; // error, double
    //float f1 = 10.5; // error, still double
    float f11 = (float) 10.5d;
    long l12 = 200L;
    int i11 = (int) l12; // You confirmed the risk
    System.out.println(i11); // 200

    // i11 = 2_200_000_000L;
    // System.out.println(i11); // error, overflow
    i11 = 2_100_000_000;
    // f10 = d10 // error

    // ! char -> int
    // 'a' 97
    // 'b' 98
    // 'A' 65
    char c1 = 'a';
    char c2 = 'b';
    System.out.println(c1 + 1); // 98 // ie 加咗operator之後就會自動變成 int
    System.out.println(c1 + c2); // 195
    System.out.println(c1 + 0); // 97
    System.out.println('你' + 0); // 20320

    int result = '你' + 100;
    // 20320 (你) + 100 -> int value
    // int value -> int variable
    System.out.println(result); // 20420

    // Math.random (unfriendly)
    // new Random()
    int r1 = new Random().nextInt(3); // 0 - 2
    System.out.println("r1 = " + r1);

    // marksix (1 - 49)
    int r2 = new Random().nextInt(49) + 1;
    System.out.println("r2 = " + r2); // a number within 1-49

    // 'a' - 'z' (ascii code, 97-122)
    int r3 = new Random().nextInt(26) + 97;
    System.out.println("r3 is " + r3);
    System.out.println("r3 is " + (char) r3); // ie 將int 強行變成char
    char character = (char) r3;
    System.out.println("character = " + character);



  }
}
