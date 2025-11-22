// interface, = 合約 contract
public interface Flyable {

  public static int counter = 0;

  public static int sum(int x, int y){
    return x + y;
  }

  // ! This is also a port of the contract
  default void run(){
    System.out.println("this is default run method in the Interface");
  }

  default void drink() {
    System.out.println("this is default drink method in the Interface");
  }

  // ! Interface (After Java 8)
  // Static method
  // Default instance method
  // ! Interface (Before Java 8)
  // - NO attribute
  // - No constructor
  // - has abstract instance method (No concrete method)
  // - One interface ccan be with more than one abstract method
  // - can be with static variable
  // - can be with static method

  // implicitly Abstract method in interface
  void fly();
  // void walk(); // it's ok to have 2 abstract methods in an interface
}
