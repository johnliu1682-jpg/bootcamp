public class DemoBigO {
  public static void main(String[] args) {
    // O(n2 + n)
    int n = 10;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        // if else...
      }
    }
    for (int 1 = 0; i < n; i++) {

    }

    // DSA
    List<String> names = new ArrayList<>();
    // List<String> names = new LinkedList<>();
    names.add("Mary"); // O(n) for ArrayList, O(1) for LinkedList
    names.add("Tommy");
    names.add("Jenny");
    System.out.println(names.get(2)); // O(1) for ArrayList; O(n) for LinkedList

    Queue<String> nickNames = new LinkedList<>();
    // Queue<String> nicknames = new ArrayDeque<>();
    nickNames.add("Leo"); // O(n) for ArrayList, O(1) for LinkedList
    nickNames.add("Oscar");
    nickNames.add("Johnny");
    nickNames.poll(); // O(n) for ArrayList, O(1) for LinkedList
  }
}
