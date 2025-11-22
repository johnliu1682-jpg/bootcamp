public class Circle extends Shape {
  private double radius;
  // ! By default, Child's empty constructor would call Parent's empty. So you need to make an empty constructor in Parent.
  public Circle() {
    // implicitly calling parent empty constructor
    //super();
  }

  public Circle(double radius, String color){
    super(color);
    this.radius = radius;
  }

  public double getRadius(){
    return this.radius;
  }

  // getArea()
  // Skip Bigdecimal
  public double getArea(){
    return this.radius * this.radius * Math.PI;
  }

  public double getArea2(){
    return this.radius * 10;
  }

  public static void main(String[] args) {
    Circle c1 = new Circle(3.5, "RED");
    Circle c2 = new Circle();
    System.out.println(c1.getColor());
  }
  
}
