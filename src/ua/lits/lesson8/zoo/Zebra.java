package ua.lits.lesson8.zoo;

public class Zebra implements Mammal {
    @Override
    public String getName() {
        return "Marty";
    }

    @Override
    public void feed() {
        System.out.println("Omnomnom");
    }

    @Override
    public void voice() {
        System.out.println("Igogog");
    }

    public void doSomething(){

    }
}
