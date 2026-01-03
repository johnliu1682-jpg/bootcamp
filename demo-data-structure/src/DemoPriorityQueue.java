import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
  public static void main(String[] args) {
    Queue<String> pq = new PriorityQueue<>();
    pq.add("Steven");
    pq.add("Alex");
    pq.add("Cathy");

    // Priority Queue has no ordering during add process, but will order when doing other methods like poll()
    System.out.println(pq);

    System.out.println(pq.poll()); // Alex // poll() automatically sorts order
    pq.add("Ben");
    System.out.println(pq.poll()); // Ben
    System.out.println(pq.poll()); // Cathy
    System.out.println(pq.poll()); // Steven
    System.out.println(pq); // []

    // Example 2
    Queue<Integer> integers = new PriorityQueue<>(new SortedByDesc());
    // Queue<Integer> integers = new PriorityQueue<>();
    integers.add(100);
    integers.add(120);
    integers.add(50);
    System.out.println(integers.poll()); // 120
    integers.add(80);
    System.out.println(integers.poll()); // 100
    System.out.println(integers.poll()); // 80
    System.out.println(integers.poll()); // 50

  }

  public static class SortedByDesc implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
      return i1 > i2 ? -1 : 1;
    }
  }

  public static void main(String[] args) {
    
  }
}
