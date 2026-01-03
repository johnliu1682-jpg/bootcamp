import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoHashMap {
  public static void main(String[] args) {
    // HashMap -> consist of Key and Value
    // ! Value -> can be any type of object

    // Fruits: orange, apple, banana
    // Animals: rabbit, monkey

    ArrayList<String> fruits = new ArrayList<>(List.of("orange", "apple", "banana"));
    ArrayList<String> animals = new ArrayList<>(List.of("rabbit", "monkey"));
    
    // <Key, Value>

    //Old school
    //HashMap<String, ArrayList<String>> dictionary1 = new HashMap<String, ArrayList<String>>();
    HashMap<String, ArrayList<String>> dictionary1 = new HashMap<>();
    dictionary1.put("fruits", fruits);
    dictionary1.put("animals", animals);

    // We use Key to find corresponding values
    ArrayList<String> listOfFruits = dictionary1.get("fruits");
    System.out.println(listOfFruits);
    ArrayList<String> listOfAnimals = dictionary1.get("animals");
    System.out.println(listOfAnimals);

    // Add a new animal (tiger)
    // animals.add("tiger");

    // dictionary1.get("animals") -> return arraylist object -> call add()
    dictionary1.get("animals").add("tiger");

    // Any difference?
    System.out.println(dictionary1.get("animals")); // [rabbit, monkey, tiger]
    System.out.println(listOfAnimals); // [rabbit, monkey, tiger]
    // Same, because the address is the same

    animals.add("lion");
    System.out.println(dictionary1.get("animals")); // [rabbit, monkey, tiger, lion]
    System.out.println(listOfAnimals);

    // The definition of put()
    // hashMap.put() -> 1. if key exists, override the value, otherwise, add a new entry
    //dictionary1.put("fruits", new ArrayList<>(List.of("lion")));
    dictionary1.put("fruits", new ArrayList<>(List.of("lemon"))); // {fruits=[lemon], animals=[rabbit, monkey, tiger, lion]}
    System.out.println(dictionary1);

    System.out.println(fruits); // object reference still exists, so we can be able to find original fruits 

    // Example 2: Key=Integer, Value=String
    HashMap<Integer, String> classmates = new HashMap<>();
    // classmate.put(Integer.valueOf(1), "John"); // originally classmate.put(1, "John"); is not allowed, but now it is allowed because 1 is auto-box
    classmates.put(1, "John");
    classmates.put(2, "Peter");

    System.out.println(classmates.get(2)); // "Peter"

    //Replace key=2 by Mary (Peter -> Mary)
    classmates.put(2, "Mary");

    //If key does not exist, get() return null
    System.out.println(classmates.get(3)); // null

    System.out.println(classmates.size()); // 2 (The number of Entries)
    System.out.println(classmates.isEmpty()); // false
    System.out.println(classmates.remove(1)); // John, remove and return removed value
    System.out.println(classmates.get(2)); // Mary
    System.out.println(classmates.size()); // 1

    System.out.println(classmates.remove(0)); // null

    // Loop HashMap (loop entries)
    // Entry Object has two methods: getKey(), getValue()
    for (Map.Entry<Integer, String> student: classmates.entrySet()) {
      System.out.println("student no=" + student.getKey() + ", student name=" + student.getValue());
    }

    System.out.println(classmates.containsKey(2)); // true
    System.out.println(classmates.containsKey(1)); // false

    System.out.println(classmates.containsValue("Mary")); // true
    System.out.println(classmates.containsValue("mary")); // false




  }

}
