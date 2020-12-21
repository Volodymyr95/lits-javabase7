package ua.lits.lesson8.zoo;

public class Lion implements Mammal {
    @Override
    public String getName() {
        return "Alex";
    }

    @Override
    public void feed() {
        System.out.println(" I love meat so much");
    }

    @Override
    public void voice() {
        System.out.println(" I am king of jungles");
    }
}
