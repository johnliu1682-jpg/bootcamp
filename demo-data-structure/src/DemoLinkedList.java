import java.util.LinkedList;

public class DemoLinkedList {
  public static void main(String[] args) {
    // ! LinkedList vs ArrayList
    // 1. add() (add to tail)
    //   ArrayList -> since array size is fixed, if add new item, need a new array with the size n+1.
    //                when adding, copy original array, paste it to new array, and add new item on the tail
    //                this will waste more memory
    //   - when size is limited (like lest than 100), use ArrayList
    //   LinkedList -> has little advantages

    // 2. size(), should store the current size (not much different between the two)

    // 3. get()
    //   ArrayList -> faster, i.e. find the 10th element in the list
    //   LinkedList -> since we don't know where the items is in the list, we need a for loop to search one by one

    // 4. contains(), both need for loop to search, similar speed

    // 5. remove(), i.e. remove "John"
    //         if remove by index, of course ArrayList is faster
    //         if remove by name, similar

    LinkedList<Cat> cats = new LinkedList<>();
    cats.add(new Cat("John"));
    cats.add(new Cat("Mary"));
    cats.remove(new Cat("John"));

    System.out.println(cats.size()); // 1
    System.out.println(cats); // [Cat(name=Mary)]

    System.out.println(cats.contains(new Cat("Mary"))); // true
    System.out.println(cats.contains(new Cat("John"))); // false




  }
}
