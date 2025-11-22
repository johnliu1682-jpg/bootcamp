public class DemoString {
  public static void main(String[] args){
    String name = "John";
    String tutor = "John Liu";
    String s1 = "adjfsafs";

    // ! String has + operation
    String firstName = "John";
    String lastName = "Liu";
    String fullName = firstName + " " + lastName;

    // short cut: sysout
    System.out.println(fullName); // John Liu

    String emptyString = "";
    System.out.println(emptyString);

    // ! String has no -,*, / operations
    // ! + operation in String, it becomes String no matter what they are.
    // String Value + double value -> String Value
    // Assign String value into String variable
    String s3 = "Sally" + 0.3;
    System.out.println(s3); //Sally0.3

    String s4 = "Leo" + 102;
    System.out.println(s4); //Leo102

    // double result = "Vincent" + 8.4; // error

    // ! Methods (Functions)
    // 1. length
    String teacher = "Steven";
    System.out.println(teacher.length()); // 6
    
    // 2. isEmpty
    System.out.println(teacher.isEmpty()); // false
    System.out.println(emptyString.isEmpty()); // true

    // 3. equals
    String s6 = "abc";
    String s7 = "abc";
    System.out.println(s6.equals(s7)); // true
    String s8 = "abcd";
    System.out.println(s8.equals(s7)); // false

    // 4. charAt
    // ! Index begins at 0
    System.out.println(s8.charAt(0)); // a
    System.out.println(s8.charAt(1)); // b
    System.out.println(s8.charAt(2)); // c
    System.out.println(s8.charAt(3)); // d
    // System.out.println(s8.charAt(4)); // error
    // System.out.println(s8.charAt(-1)); // error

    // null (non-primitive/ class)
    String s5 = ""; // empty string, but value exists
    System.out.println(s5.length()); // 0

    String s10 = null; // no value
    // System.out.println(s10.length()); // error, ie not callable
    // s10.char(0); // error

    // 5. isBlank()
    String s11 = "";
    String s12 = " ";
    String s13 = "Tommy";

    System.out.println(s11.isEmpty()); // true
    System.out.println(s12.isEmpty()); // +false+
    System.out.println(s13.isEmpty()); // false

    System.out.println(s11.isBlank()); // true
    System.out.println(s12.isBlank()); // +true+
    System.out.println(s13.isBlank()); // false

    // 6. substring()
    // syntax: String java.lang.String.substring(int beginIndex, int endIndex)
    String s14 = "Hello World!!!";
    // ! index = length - 1
    System.out.println(s14.substring(6, 11)); // World (the 11th char is "!", which doesn't show)
    System.out.println(s14.substring(3)); // lo World!!!

    // 7. toLowerCase(), toUpperCase()
    System.out.println(s14.toLowerCase()); // hello world!!!
    System.out.println(s14.toUpperCase()); // HELLO WORLD!!!

    // Java -> Type
    // ! chain method
    System.out.println(s14.toUpperCase().charAt(1)); // E
    // System.out.println(s14.toUpperCase().charAt(1).length()); // error, wrong type
    System.out.println(s14.substring(4).length()); // 10
    // System.out.println(s14.substring(4).length().charAt(1)); // error

    // 8. replace()
    String s17 = "Python";
    String s18 = s17.replace("y", "x");
    System.out.println(s18); // Pxthon

    System.out.println(s17.replace("y","x").toUpperCase()); // PXTHON
    String s19 = s17.replace("th", "!!!");
    System.out.println(s19);

    // 9. contains
    System.out.println(s17.contains("Py")); // true
    System.out.println(s17.contains("PY")); // false, ie case sensitive
    System.out.println(s17.contains("t")); // true
    System.out.println(s17.contains("")); // true

    // 10. startsWith(), endsWith()
    System.out.println(s17.startsWith("Pyt")); // true
    System.out.println(s17.startsWith("p")); // false
    System.out.println(s17.startsWith("Pytl")); // true

    System.out.println(s17.endsWith("hon")); // true
    System.out.println(s17.endsWith("N")); // false

    // 11. indexOf()
    System.out.println(s17.indexOf("th")); // 2
    System.out.println(s17.indexOf("tha")); // -1 (-1 means cannot find)

    System.out.println(s17.indexOf('o', 3)); // 4
    System.out.println(s17.indexOf('n', 3, 4)); // -1

    // lastIndexOf()
    String s20 = "hello world";
    System.out.println(s20.indent('l')); // 2
    System.out.println(s20.lastIndexOf('l')); // 9

    // 12. concat()
    String combined = "abc" + "def"; // slower, but easy to read
    System.out.println(combined); // abcdef

    String s21 = "abc".concat("def"); // faster 
    System.out.println(s21); // abcdef

    System.out.println("abcd".concat("ijk").concat("xyz")); // abcdijkxyz

    // 13. equalsIgnoreCase()
    String student1 = "John";
    String student2 = "john";
    System.out.println(student1.equals(student2)); // false
    System.out.println(student1.equalsIgnoreCase(student2)); // true

    // 14. trim()
    String username = "vincentlau";
    String username2 = " vincentlau  ";
    System.out.println(username2.trim().length()); // 10
    System.out.println(username.trim().length()); // 10

    String username3 = " vincent lau  ";
    System.out.println(username3.trim().length()); // 11
    
    // 15. compareTo()
    String apple = "apple";
    String banana = "banana";

    System.out.println(apple.compareTo(banana)); // -1 (since a-b)

    String cat = "cat";
    System.out.println(cat.compareTo(apple)); // 2 (since c-a)

    String boy = "boy";
    System.out.println(boy.compareTo(banana)); // 14 (since o-a)

    String boy1 = "Boy";
    System.out.println(boy1.compareTo(boy)); // -32 (since B - b)

    String cat1 = " cat";
    System.out.println(cat.compareTo(cat1)); // 67 (since c - " ")

    





  }
}
