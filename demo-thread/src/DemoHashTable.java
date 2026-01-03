import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;

// ! HashTable (thread-safe) vs HashMap (non-thread-safe)
public class DemoHashTable {
  public static void main(String[] args) {
    // Map<Integer, Integer> map = new HashMap<>();
    Map<Integer, Integer> map = new Hashtable<>();

    Runnable task = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        map.put(i, i);
      }
    };

    long before = System.currentTimeMillis();
    Thread t1 = new Thread(task); // assign task to the thread
    Thread t2 = new Thread(task); // assign task to the thread
    t1.start(); // Thread t1 starts to execute task
    t2.start(); // Thread t2 starts to execute task
    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {

    }
    long after = System.currentTimeMillis();
    long timeUsed = after - before;
    System.out.println("time used=" + timeUsed);
    System.out.println(map.size());


  }
}
