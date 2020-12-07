package ua.lits.lesson4;

public class Cafe {

  double price = 16;

  public void lunch(Human human) {
    human.eat("Burger", 0.3);
    human.weight = human.weight + 0.3;
  }

  public double pay(double money) {
    return money - price;
  }

  public static void close() {
    System.out.println("Is closing");
  }
}
