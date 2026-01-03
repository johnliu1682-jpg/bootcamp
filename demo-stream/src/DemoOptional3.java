import java.lang.foreign.Linker.Option;
import java.util.Optional;

public class DemoOptional3 { // Cat has Optional Object, and Optional Object has name
  private Optional<String> name; // ! Wasting memory

  // ! What is the problem of return null after getName()
  public Optional<String> getName(){
    return this.name;
  }

  public static void main(String[] args) {
    // Cat c1 = new Cat("Jenny");
    // if (c1.getName() != null && c1.getName().equals("Jenny")) {}

    // ! Summary: As developer, you always do null check before using the object.
    // 1. Avoid
    // 2. Throw

  }
}
