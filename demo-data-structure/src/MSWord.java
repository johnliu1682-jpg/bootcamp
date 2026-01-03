import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MSWord {
  private List<Character> characters;
  // Deque
  private Deque<Character> undoStack;
  private Deque<Character> redoStack;



  // characters.add("a");
  // characters.add("b");
  // characters.add("c");

  public MSWord() {
    this.characters = new LinkedList<>();
  }

  public void write(char c) {
    this.characters.add(c);
  }

  public void undo() {

  }

  public void redo() {
    
  }


}
