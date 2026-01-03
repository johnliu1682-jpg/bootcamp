public class ObjectList<T> {
  private T[] objects;

  public ObjectList() {
    this.objects = (T[]) new Object[0];
    
  }

  public static void main(String[] args) {
    // ! ArrayList.class
    ObjectList<String> strings = new ObjectList<>();
  }
  
}
