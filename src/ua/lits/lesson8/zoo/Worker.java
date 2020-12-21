package ua.lits.lesson8.zoo;

public class Worker {

    private Mammal mammal;

    public Worker(Mammal mammal) {
        this.mammal = mammal;
    }

    public void feedMammal() {
        System.out.println("Class: " + mammal.getClass());
        System.out.println("Worker is feeding " + mammal.getName());
        mammal.feed();
    }
}
