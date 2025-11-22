public class DemoObject {
  public static void main(String[] args) {
    // ! Parent vs Chinld
    // Child object can be assigned to Parent Object reference

    // Example
    String s = "hello"; // ie. "String s" is a parent object
    // "hello" = -> String Object
    Object o1 = "Hello";  // "Object" by default is the parent of the universe
    Object o2 = new Warrior();
    Shape sh1 = new Circle(); // ie. "Shape sh1" is a parent object of Cicle
    Circle c1 = new Circle(); // ie. "Circle c1" is a child object of Shape

    Object[] things = new Object[3];
    things[0] = new Warrior();
    things[1] = new String("hello");
    things[2] = new Square(3.5, "WHITE");

    // ! Polymorphism
    // Square -> area()
    // things[2].getArea; // ! runtime OK, but you cannot pass through the compile time
    // ダメ, parent object can store every child object, but cannot call child method
    // things[0].attack(new Warror());
    
    // so the only way to call .getArea is put it into Square object.

    // Compile Time (The time you are writing the code)
    Square sq1 = new Square(3.5, "WHITE");
    sq1.getArea();

    // Shape is an abstract class
    // Object.class -> Shape.class -> Circle.class
    

  }
}
