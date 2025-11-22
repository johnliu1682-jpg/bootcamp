public class Candy {
  private final String color; // final -> meaning no one can set color
  public Candy(String color){
    this.color = color;
  }
  public String getColor(){
    return this.color;
  }

  public String toString(){
    return "Candy(" //
      + "collor=" + this.color //
      + ")";
  }
  
}
