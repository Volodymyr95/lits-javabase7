package ua.lits.lesson4;

import java.util.Arrays;
import java.util.Objects;

public class Human implements Cloneable {
  static int population = 0;
  String name;
  String surname;
  double weight;
  boolean isMale;
  int age;
  double money = 0;
  Human father;
  Human mother;
  Human[] brothers;
  Human[] children;

  Human() {
    population++;
  }

  Human(String name, String surname) {
    this.name = name;
    this.surname = surname;
    population++;
  }

  void eat(String type, double weight) {
    System.out.println(name + " have eaten " + weight + " kg of " + type);
  }

//  void die() {
//    System.out.println(name + " " + surname + " помирає");
//  }

  static void die(Human human) {
    System.out.println(human.name + " " + human.surname + " помирає");
    human.surname = human.surname + " dead";
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void setMale(boolean male) {
    isMale = male;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public double getWeight() {
    return weight;
  }

  public boolean isMale() {
    return isMale;
  }

  public int getAge() {
    return age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Human human = (Human) o;
    return Objects.equals(name, human.name) &&
        Objects.equals(surname, human.surname);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(name, surname);
    return result;
  }

  @Override
  public Human clone() {
    Human two = new Human();
    two.surname = surname;
    two.name = name;
    return two;
  }
}
