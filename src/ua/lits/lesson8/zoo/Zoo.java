package ua.lits.lesson8.zoo;

public class Zoo {
  public static void main(String[] args) {

    Mammal alex = new Lion();
    Mammal marty = new Zebra();
    Worker feeder = new Worker(alex);
    Worker feeder2 = new Worker(marty);
    feeder.feedMammal();
    feeder2.feedMammal();
  }
}
