import java.util.Arrays;
import java.util.Random;

public class Teacher extends Human {
  public static int candyCount = 23;
  private static final String[] CANDY_COLORS = new String[] {"RED", "BLUE", "YELLOW"}; // 0, 1, 2

  // Bonus Question
  private Candy[] candies;
  public Teacher(int candyCount) {
    // random color -> BLUE, RED, YELLOW
    
    this.candies = new Candy[candyCount];
    for (int i = 0; i < this.candies.length; i++){
      String randomColor = CANDY_COLORS[new Random().nextInt(3)];
      // candies[i].color = "BLUE"; //WRONG
      this.candies[i] = new Candy(randomColor);
    }
    // System.out.println("Candies=" + Arrays.toString(this.candies));
  }

  public void distributeAll(Student[] students){
    // teacher's candy?
    // remove this teacher's candy
    // call distribute
    int candyIdx = 0;
    while(candyIdx < this.candies.length) { // teacher's candy (0-36)

      for (Student student: students) {
        Candy candy = this.candies[candyIdx];
        this.candies[candyIdx] = null; // removed teacher's candy
        this.distribute(student, candy);
        if (++candyIdx >= this.candies.length){
          break;
        }
        System.out.println(student.getId() + " " + candy.getColor());
        
      }
    }
    this.candies = new Candy[0];  // clear teacher's candy array
  }

  public void distribute(Student student, Candy candy) {

    student.receiveCandy(candy);
  }

  public static void main(String[] args) {
    // OOP
    // 5 Students, 23 Candy

    // Algorithm -> loop + if + break -> performance (time complexity) / space complexity
    Student[] students = new Student[] {new Student(), new Student(), new Student(), new Student(), new Student()};
    while(candyCount > 0){ // counting 22 -> 0, 23times
      for (int i = 0; i < students.length; i++) {
        if (candyCount-- < 0){
          break; // break for loop
        }
        students[i].addCandy();
      }
      // after break
    }
    System.out.println(students[0].getCandyCount()); // 5
    System.out.println(students[1].getCandyCount()); // 5
    System.out.println(students[2].getCandyCount()); // 5
    System.out.println(students[3].getCandyCount()); // 4
    System.out.println(students[4].getCandyCount()); // 4

    // Student1.getCandyCount() -> 5
    // Answer: 5 5 5 4 4

    // ! Bonus (Teacher.java, Student.java, Candy.java)
    // Without using static candyCount, we use Teacher object to hold 23 candy
    // Candy Object with color, distribute to 5 students

    // ! Candy.java, Teacher (Candy), Student (Candy) -> receiveCandy
    // Candy (Ownership) 
    // Answer: Finally, teacher has no candy. Each Student has his own Candy with different color.
    Student[] students2 = new Student[] {new Student(), new Student(), new Student(), new Student()};
    Teacher t1 = new Teacher(37);
    t1.distributeAll(students2);
    System.out.println(Arrays.toString(students2[0].getCandies()));
    System.out.println(Arrays.toString(students2[1].getCandies()));
    System.out.println(Arrays.toString(students2[2].getCandies()));
    System.out.println(Arrays.toString(students2[3].getCandies()));
  }
}