package SimpleJack;

import java.util.List;

public abstract class Player {
  
  private Hand hand;
  private String name;

  public Player(String name) {
    this.name = name;
    this.hand = new Hand();
  }

  public void addCard(Card card) {
    hand.addCard(card);
  }

  public void removeCard(Card card) {
    hand.removeCard(card);
  }

  public void clear() {
    hand.clear();
  }

  public String getName() {
    return name;
  }

  public String getHandAsString() {
    return hand.toString();
  }

  public List<Card> getReadOnlyCards() {
    return hand.getReadOnlyCards();
  }

  public boolean shouldDraw() {
    String choice = Dealer.scanner.nextLine();
    if (choice.equalsIgnoreCase("hit")) {
      return true;
    }
    return false;
  }
}