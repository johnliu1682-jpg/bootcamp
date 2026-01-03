public class HandManager {
  private Card[] cards;

  public HandManager(Card[] cards){
    // if cards.length != 5, throw exception
    this.cards = cards;
  }

  public void setCards(Card[] cards){
    this.cards = cards;
  }

  public boolean withEmptyCard() {
    return cards[0] == null || cards[1] == null //
      || cards[2] == null || cards[3] == null //
      || cards[4] == null;
  }

  // 33322 -> true
  // AAA99 -> true
  // A9A9A -> true
  public boolean isFullHouse() {
    // Algorithm
    if (withEmptyCard())
      return false;
    int[] boxes = new int[13]; // 13 Ranks in total
    for (Card card : this.cards) {
      boxes[card.getRank().getValue() - 1]++;
    }

    // searching 3
    int threeCount = 0;
    int twoCount = 0;
    int zeroCount = 0;
    for (int i = 0; i < 13; i++) {
      if (boxes[i] == 0)
        zeroCount++;
      if (boxes[i] == 2)
        twoCount++;
      if (boxes[i] == 3)
        threeCount++;
    }
    return zeroCount == 11 && twoCount == 1 && threeCount == 1;

  }

  // Straight Flush

  
  public static void main(String[] args) {
    Card c1 = new Card(Suite.DIAMOND, Rank.ACE);
    Card c2 = new Card(Suite.HEART, Rank.TWO);
    Card c3 = new Card(Suite.SPADE, Rank.ACE);
    Card c4 = new Card(Suite.CLUB, Rank.ACE);
    Card c5 = new Card(Suite.DIAMOND, Rank.TWO);
    Card[] hand1 = {c1, c2, c3, c4, c5};

    Card[] hand2 = new Card[] { //
      new Card(Suite.HEART, Rank.ACE) //
      , new Card(Suite.CLUB, Rank.ACE) //
      , new Card(Suite.HEART, Rank.TEN) //
      , new Card(Suite.DIAMOND, Rank.QUEEN) //
      , new Card(Suite.SPADE, Rank.TEN)
    };

    HandManager hm = new HandManager(hand1);
    System.out.println(hm.isFullHouse());
  }
}
