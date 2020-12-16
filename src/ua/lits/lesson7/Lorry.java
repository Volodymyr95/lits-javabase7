package ua.lits.lesson7;

public class Lorry implements Vehicle2, SportCarInteface {

    private Fuel fuel = Fuel.DIESEL;

    @Override
    public void run() {
        System.out.println("Lorry is moving");
    }

    @Override
    public void addPetrol(AddingPetrol addingPetrol) {
        System.out.println("Preparing to adding petrol");
        addingPetrol.apply(Fuel.DIESEL);
        System.out.println("Adding petrol is finished");
    }

    @Override
    public void sound() {
        System.out.println("Lorry sound pih pah");
    }

    public Fuel getFuel() {
        return fuel;
    }
}
