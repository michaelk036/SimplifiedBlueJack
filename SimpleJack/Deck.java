package SimpleJack;

import java.util.Collections;
import java.util.ArrayList;

public class Deck {

  private ArrayList<Card> cards;

  public Deck() {
    cards = new ArrayList<>();
    resetDeck();
    shuffleDeck();
  }

  public Card drawCard() {
    return cards.remove(0);
  }

  private void resetDeck() {
    cards.clear();
    for (int i = 1; i <= 13; i++) {
      int value = i;
      if (value > 10) {
        value = 10;
      }
      cards.add(new Card("SPADE", value));
      cards.add(new Card("CLUB", value));
      cards.add(new Card("HEART", value));
      cards.add(new Card("DIAMOND", value));
    }
  }

  private void shuffleDeck() {
    Collections.shuffle(cards);
  }
}