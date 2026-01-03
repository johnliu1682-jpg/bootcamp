// ! Java 16
// Attributes (Final by default)
public record Cat(String name, int age) {

  // Constructor
  // public Cat(String name) {}
  // getter, setter

  // setter (we won't use it. "record" is like a history. We don't revise history)
  // public void setName(String name) {
  //   System.out.println("hello");
  // }

}
