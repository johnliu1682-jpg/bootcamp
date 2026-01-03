import java.util.Arrays;
import java.util.Random;

public class ShuffleManager {
  private Deck deck; // keeping address only

  public ShuffleManager(Deck deck){
    this.deck = deck;

  }

  public void shuffle(){
    Card[] newCards = new Card[deck.getCards().length];
    int idx = 0;


    // Shuffle Method: Pick 10 cards in the middle
    for (int i = 0; i < 10; i++) { // 100 times
      idx = 0;
      // random idx (20-40) 0 - 20
      int randomIdx = new Random().nextInt(21) + 20;
      for (int j = randomIdx; j < randomIdx + 10; j++) {
        
        newCards[idx++] = deck.getCards()[j];
      }
      // System.out.println("+++++++ BEFORE SUFFLE +++++++");
      // System.out.println(Arrays.toString(newCards));
      // System.out.println("+++++++ BEFORE SUFFLE +++++++");
      for (int j = 0; j < randomIdx; j++) {
        newCards[idx++] = deck.getCards()[j];
      }
      // System.out.println("+++++++ BEFORE SUFFLE +++++++");
      // System.out.println(Arrays.toString(newCards));
      // System.out.println("+++++++ BEFORE SUFFLE +++++++");
      for (int j = randomIdx + 10; j < deck.getCards().length; j++) {
        newCards[idx++] = deck.getCards()[j];
      }
      System.out.println("+++++++ i=" + i + ", randomIdx=" + randomIdx + " +++++++");
      System.out.println(Arrays.toString(newCards));
      System.out.println("+++++++  +++++++");
      deck.setCards(newCards);
    }
  }

  public static void main(String[] args) {
    Deck d1 = new Deck();
    // System.out.println("+++++++ BEFORE SUFFLE +++++++");
    System.out.println(Arrays.toString(d1.getCards()));
    // System.out.println("+++++++  +++++++");
    ShuffleManager sm = new ShuffleManager(d1);
    sm.shuffle();
    // System.out.println("+++++++ FINAL +++++++");
    System.out.println(Arrays.toString(d1.getCards()));
    // System.out.println("+++++++  +++++++");

  }
}
