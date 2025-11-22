public class Person {
  private Eye[] eyes;

  // APIE (Encapsulation)
  public Person() { 
    this.eyes = new Eye[2]; // ! Array Object
    this.eyes[0] = new Eye("BLACK");
    this.eyes[1] = new Eye("BLACK");
  }

  // changeRightEyeColor(String color)
  public void changeRightEyeColor(String color){
    this.eyes[1].setColor(color);
    
  }



  public Eye getLeftEye(){
    return this.eyes[0];
  }


  public void setLeftEye(Eye eye) {
    this.eyes[0] = eye;
  }

  public static void main(String[] args) {
    Person p1 = new Person();
    Eye e1 = new Eye("RED");
    p1.setLeftEye(e1);

    // p1.setLeftEye(new Eye("YELLOW"));
    e1.setColor("ORANGE");

    System.out.println(p1.getLeftEye().getColor()); // ORANGE

    

  }

}
