public class Cat extends Animal {
  public static void main(String[] args) {
    // Object -> Animal -> Cat
    Cat c1 = new Cat();
    Animal a1 = new Cat();
    Object o1 = new Cat();
    Object o2 =  new Animal();
    System.out.println(o2.toString());
    System.out.println(a1 instanceof Cat); // true
    System.out.println(a1 instanceof Dog); // false
    System.out.println(o2 instanceof Cat);

    a1 = new Dog();
    System.out.println(a1 instanceof Dog); // true

    // Cat c2 = (Cat) a1; // Compile OK, runtime ERROR
    if (a1 instanceof Cat){
      Cat c2 = (Cat) a1; // "(Cat) a1" means a1 address is not in Animal
      // Use c2 to call Cat's method
    } else if (a1 instanceof Dog) {
      Dog d2 = (Dog) a1;
      // Use d2 to call Dog's method
    }

  }
  
}
