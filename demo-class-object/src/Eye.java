public class Eye {
  // ! Attribute
  private String color;

  // ! Constructor
  public Eye (){}
  public Eye (String color){
    this.color = color;
  }
  // ! Getter
  public String getColor() {
    return this.color;
  }
  // ! Setter
  public void setColor(String color){
    this.color = color;
  }

  public static void main(String[] args) {
    Eye eye1 = new Eye("GREEN");
    System.out.println(eye1.getColor());
  }
}
