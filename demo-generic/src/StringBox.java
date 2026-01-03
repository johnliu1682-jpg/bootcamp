public class StringBox {
  private String value;

  public StringBox(String value) {
    this.value = value;
  }
  public String getValue() {
    return this.value;
  }



  public static void main(String[] args) {
    // Box of String
    // Box of Integer

    // Background: I want a flexible design for storing a different type of values
    // 1. Write all classes with a specific type of value (i.e.) StringBox, IntegerBox...
    // 2. Generic - Box<T>

    Box<String> stringBox = new Box<>("hello");
    Box<Integer> integerBox = new Box<>(100);

    // ! Generic just help avoid rewrite a number of classes, but not allow you to change the type of box.
    // integerBox = "hello"; // integerBox has been defined as Integer for T during initialization

    // If you want to define a box object storing anything at anytime
    Box<Object> superBox = new Box<>("hello");
    // superBox = new Box<>(Double.valueOf(0.5));
    superBox.setValue(Double.valueOf(0.5));

    superBox.setValue("abc");
    // Polymorphism, know it is an error during runtime
    superBox.getValue().charAt(0); // compile error, Object.class is Parent, "Object" object cannot call child (char) method

  }
}
