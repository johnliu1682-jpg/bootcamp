public class ModernChair implements Chair {
  @Override
  public boolean hasLegs() {
    System.out.println("I am Modern Chair, hasLeg().");
    return false;
  }
  @Override
  public boolean sitOn() {
    return false;
  } 
  
}
