package BlueJack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dealer {
  public static Scanner scanner = new Scanner(System.in);
  private Deck deck;
  private List<Player> players;
  private BlueJack bluejack;

  public Dealer(BlueJack bluejack) {
    deck = new Deck();
    players = new ArrayList<>();
    this.bluejack = bluejack;
  }

  public void setGame(BlueJack bluejack) {
    this.bluejack = bluejack;
  }

  public void addPlayer(Player player) {
    players.add(player);
  }

  public void play() {
    bluejack.initializeHands(deck, players);
    bluejack.playRound(deck, players);
    bluejack.scoreRound(deck, players);
  }
}