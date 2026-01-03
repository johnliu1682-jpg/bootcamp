import java.util.concurrent.atomic.AtomicInteger;

public class DemoThread4 {

  private AtomicInteger x = new AtomicInteger(0);
  // private int x = 0;

  public void increment() {
    this.x.getAndAdd(1);
  }

  public int getX() {
    return this.x.intValue();
  }

  public static void main(String[] args) {
    // ! main Thread
    int x = 3;
    x++;
    System.out.println(x); // 4
    x++;
    System.out.println(x); // 5

    DemoThread4 d1 = new DemoThread4();

    // lambda
    Runnable task = () -> {
      for (int i = 0; i < 100_000; i++) {
        d1.increment();
      }
    };

    Thread t1 = new Thread(task); // assign task to the thread
    Thread t2 = new Thread(task); // assign task to the thread
    t1.start(); // Thread t1 starts to execute task
    t2.start(); // Thread t2 starts to execute task
    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {

    }

    System.out.println(d1.getX()); // not 200_000

  }
}

