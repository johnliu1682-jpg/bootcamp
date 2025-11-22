// ! Class author writes down the ways to access (read (=get) & write (=set)) the attribute values
// ! Method Definition: Presentation (run some program and present)

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Dog {
  // ! Attribute
  private double weight;
  private double height;

  // ! Constructor
  // ! empty constructor, all args construtor
  public Dog () {

  }

  // Java(67109219)
  // ! Duplicated: the number of parameter and the type of the parameters of them are same
  public Dog (double weight) {
    this.weight = weight;
  }
  public Dog (double height) {
    this.height = height;
  }

  // ! What is the meaning of "This"?
  public Dog (double x, double y) {
    this.weight = x;
    this.height = y;

  }

  // ! getter for weight and height
  public double getWeight() {
    return this.weight;
  }
  public double getHeight() {
    return this.height;
  }
  // ! A presentation of weight and height
  public double getBMI() {
    BigDecimal heightSquare = BigDecimal.valueOf(height)
      .multiply(BigDecimal.valueOf(height))
      .setScale(2, RoundingMode.HALF_UP);

    return BigDecimal.valueOf(this.weight) //
      .divide(heightSquare, 2, RoundingMode.HALF_UP) //
      .doubleValue(); // chaning it form bigdecimal to double
  }

  // ! setter (update attribute)
  public void setWeight(double weight){ // void -> return nothing
    this.weight = weight;
  }
  public void setHeight(double height){ // void -> return nothing
    this.height = height;
  }

  // main -> testing
  public static void main(String[] args) {
    // Dog 4.5, 0.3
    Dog d1 = new Dog(4.5, 0.3);
    // Dog 5.5, 0.25
    Dog d2 = new Dog(5.5, 0.25);

    // get d2's height
    // get d1's weight
    System.out.println(d2.getHeight()); // never 'd2.height'
    System.out.println(d1.getWeight());

    // ! double primitive default value = 0.0
    Dog d3 = new Dog();
    System.out.println(d3.getHeight()); // 0.0 
    System.out.println(d3.getWeight()); // 0.0

    System.out.println(d1.getBMI());
    System.out.println(d2.getBMI());
  }

}
