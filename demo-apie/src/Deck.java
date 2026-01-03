public class Deck {
  // card array
  // [DIAMOND, A], [DIAMOND, 2], ..., [SPADE, Q], [SPADE, K]
  
  
  // private static final 
  
  private Card[] cards;

  public Deck() {
    this.cards = new Card[Suite.values().length * Rank.values().length];
    int idx = 0;
    for (Suite suite : Suite.values()) {
      for (Rank rank : Rank.values()) {
        this.cards[idx++] = new Card(suite, rank);
      }
    }
  }

  public Card[] getCards(){
    return this.cards;
  }

  public void setCards(Card[] cards){
    this.cards = cards;
  }




}
