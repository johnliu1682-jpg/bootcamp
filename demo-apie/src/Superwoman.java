public class Superwoman implements Flyable {
  @Override
  public void fly(){
    System.out.println("Superwoman is flying");
  }
  // ! Superwoman can enjoy the default method of drink
  // ! but Superman won't be impacted.
}
