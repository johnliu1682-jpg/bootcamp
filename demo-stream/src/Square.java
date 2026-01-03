public class Square {
  private double length;

  // Step 2
  public static Builder builder() {
    return new Builder();
  }

  // Step 5
  public Square(double length) {
    this.length = length;
  }

  public double area() {
    return this.length * this.length;
  }

  // Step 1
  public static class Builder{
    private double length;

    //Step 3
    public Builder length(double length){
      this.length = length;
      return this;
    }

    // Step 4
    public Square build() {
      return new Square(this.length);
    }
  }

  public static void main(String[] args) {
    Square s1 = Square.builder() // return Builder object
      .length(7) // return Builder object
      .build(); // return Square object

    System.out.println(s1.area()); // 49.0
  }
}