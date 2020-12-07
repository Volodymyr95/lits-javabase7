package ua.lits.lesson4;

public class Main {

  public static Human godOfThunder = new Human("Thor", "Odinson");

  public static void main(String[] args) {
    String namePetro = "Petro";
    String surnamePetro = "Ivanov";
//    ...
    String nameIvan = "Ivan";
    String surnameIvan = "Kozlov";

    String namePetro2 = "Petro";
    String surnamePeto2 = "Milner";

//    ..

    String namePetro500 = "Petro";
    String surnamePeto500 = "Milner";

    System.out.println("Population is: " + Human.population);
    System.out.println("------------------");
    Human one = new Human();
    one.setName("Petro");
    one.setSurname("Ivanov");
    one.setAge(45);
    one.setMale(true);
    one.setWeight(107);
    Human[] children = new Human[1];
    System.out.println("Population is: " + Human.population);
    System.out.println("Population is: " + one.population);
    System.out.println("------------------");

    Human two = new Human("Peter", "Parker");
    two.money = 100;
    two.weight = 54;
    two.age = 18;
    two.isMale = true;
    two.father = one;
    children[0] = two;
    one.children = children;
    System.out.println("Population is: " + Human.population);
    System.out.println("Population is: " + one.population);
    System.out.println("Population is: " + two.population);
    System.out.println("------------------");

    one.die(godOfThunder);

    System.out.println(godOfThunder.name + " " + godOfThunder.surname);

//    System.out.println(two.name + " has weight " + two.weight);
//
//    Cafe cafe = new Cafe();
//    cafe.lunch(two);
//    System.out.println("Money was:" + two.money);
//    two.money = cafe.pay(two.money);
//    System.out.println("Money now:" + two.money);
//
//    System.out.println(two.name + " has weight " + two.weight);




//    int a = 10;
//    int b = 100;
//    a == b
//    Human three = new Human("Tony", "Stark");
//    Human four = new Human("Tony", "Stark");
//    Human four = three.clone();
//    if (three == four) {
//      System.out.println("Objects are equals");
//    } else {
//      System.out.println("Object are not equals");
//    }
//    System.out.println(three.name);
//    System.out.println(four.name);
//    four.name = "John";
//    System.out.println(three.name);
//    System.out.println(four.name);

//    if (three.equals(four)) {
//      System.out.println("Objects are equals");
//    }
  }

  private static void doWork(Human human) {
    System.out.println(human.getSurname());
  }
}

//HUMAN
/*
String Name
String Surname
Sex - boolean isMale
double Weight
int Age
 */
