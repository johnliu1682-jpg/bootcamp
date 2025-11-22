// ! Class -> blueprint (模), file (harddisk)
// ! Object
public class Cat {
  // ! Attribute 特徵
  private String name;
  private int age;

  // ! Constructor 製造過程

  // ! Empty Constructor (No Parameter)
  public Cat() {
    System.out.println("Creating a cat...");
    // default name and age
    this.name = "John"; // "this" = 製造過程中的第一人稱
    this.age = 10;
  }

  // ! All Arguments Constructor
  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // ! Object Method (Instance Method)
  public String getName() {
    return this.name;
  }
  // ! Object Method (Instance Method)
  public String getAge() {
    return this.age;
  }

  public static void main(String[] args) {
    // ! Create a cat object
    // "new" -> create
    // "Cat()" -> calling a construtor
    // "new Cat()" -> create a cat object

    // declare a Cat object called "c1"
    // "c1" is a label to refer the cat object
    Cat c1 = new Cat();
    System.out.println(c1.name); // John
    System.out.println(c1.age); // 10

    new Cat(); // ! You no longer able to find the cat object, after creating it.

    Cat c2 = new Cat();
    System.out.println(c2.name); // John
    System.out.println(c2.age); // 10

    c2.name = "Jennie";
    c2.age = 12;

    Cat[] cats = new Cat[] {c1, c2};
    System.out.println(cats[1].name); // Jennie

    // ! Without Class
    String[] names = new String[] {"John", "Jennie"}; //excel column
    int[] ages = new int[] {10, 12}; // excel column, 

    // ! excel row -> object

    Cat c3 = new Cat("Mary", 8);
    Cat c4 = new Cat(); // John 10
    System.out.println(c3.getAge()); // 8
    System.out.println(c4.getAge()); // 10

    byte aa = 24;
    byte bb = 7;
    byte cc = (byte) (aa * bb);
    System.out.println(cc);
  }

  
}
