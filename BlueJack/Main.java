package BlueJack;

public class Main {
  public static void main(String[] args) {
    Dealer dealer = new Dealer(new BlueJack());

    System.out.println("How many players are there");
    int humanCount = Dealer.scanner.nextInt();
    Dealer.scanner.nextLine();

    for (int i = 0; i < humanCount; i++) {
        System.out.println("What is Player " + i + " 's name?");
        String name = Dealer.scanner.nextLine();
        dealer.addPlayer(new Player(name));
    }

    dealer.play();
  }
}