public class DemoStatic {
  // ! static variable
  public static String content = "";

  // ! Final variable
  public final String https = "https";

  // ! Static Final variable (常數/定義)
  // Naming convention: snake case
  public static final int HOURS_PER_DAY = 24;

  // ! Object's method can access static variable & method
  // ! Static method CANNOT access objects, ie no this.x, this.y

  private int x = 3;
  private int y = 5;

  public DemoStatic(int x, int y){
    this.x = x;
    this.y = y;
  }

  public DemoStatic(){

  }

  public static void main(String[] args) {
    // Call static variable
    content += "abc";
    content += "def";
    System.out.println(content);
    // Formally call static variable
    System.out.println(DemoStatic.content);

    // Call static method
    System.out.println(DemoStatic.sum(10, 3)); // 13

    // Call instance method
    DemoStatic ds = new DemoStatic();
    System.out.println(ds.subtract(10, 3)); // 7

    // Call instatnce method
    DemoStatic ds2 = new DemoStatic();
    System.out.println(ds2.multiply()); // 7

    // ! Call Final variable
    DemoStatic ds3 = new DemoStatic();
    System.out.println(ds3.https); // "https"
    // Final Variable cannot be re-assigned.
    // ds3.https = "hello";

    System.out.println(DemoStatic.HOURS_PER_DAY);
  }



  public static int sum(int x, int y){
    // return x + y + this.x; // ! static method doesn't make sense to call "this",
    // ! because static method belongs to Class, but not object
    return x + y;
  }
  public  int subtract(int x, int y){
    return x - y;
  }
  public  int multiply(){
    return x * y;
  }
  
}
