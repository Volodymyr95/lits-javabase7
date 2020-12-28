package ua.lits.lesson9;

import ua.lits.lesson9.polimorphism.Apple;

import java.util.ArrayList;

public class CollectionMain {
    public static void main(String[] args) {
        ArrayList<String> listStringNumbers = new ArrayList();
        listStringNumbers.add("One");
        listStringNumbers.add("two");
        listStringNumbers.add("three");
        listStringNumbers.add("four");
        listStringNumbers.add("five");
        listStringNumbers.add("six");
        listStringNumbers.add("seven");


        for(int i = 0; i< listStringNumbers.size(); i++) {
            String s = listStringNumbers.get(i);
            System.out.println(s.toUpperCase());
        }

        System.out.println(listStringNumbers);

      //  System.out.println(new Apple().hashCode());
        Apple apple = new Apple();
        Apple apple1 = apple;
        apple.setColor("white");
        System.out.println(apple.equals(apple1));
        System.out.println(apple1.getColor());


        

    }
}
