import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import demo-apie.src.Color;

public class SortedByColor1 implements Comparator<Ball> {
  // sorting formula can be an object

  // BLUE -> RED -> YELLOW
  // (-1) b1, (1) b2
  @Override
  public int compare(Ball b1, Ball b2) {
    if (b1.getColor() == Ball.Color.BLUE)
      return -1; // -1 -> no need to swap
    if (b2.getColor() == Ball.Color.BLUE)
      return 1;
    if (b1.getColor() == Ball.Color.RED)
      return -1; // -1 -> no need to swap
    if (b2.getColor() == Ball.Color.RED)
      return 1;
    return -1;
  }

  public static void main(String[] args) {
    Ball b1 = new Ball(Ball.Color.RED, 10);
    Ball b2 = new Ball(Ball.Color.YELLOW, 20);
    Ball b3 = new Ball(Ball.Color.BLUE, 80);

    ArrayList<Ball> balls = new ArrayList<>(List.of(b1, b2, b3));
    Collections.sort(balls, new SortedByColor1());

  }

}
