package ua.lits.lesson7;

public class Car extends Vehicle implements SportCarInteface {

    private Fuel fuel = Fuel.PETROL;

    @Override
    public void run() {
        System.out.println("Машина їде");
    }

    @Override
    public void addPetrol(Fuel fuel) {
        switch (fuel) {
            case DIESEL:
                System.out.println("Wrong type of fuel");
                break;
            case PETROL:
                System.out.println("adding fuel");
                break;
            default:
                System.out.println("Wrong type of fuel");

        }


        if (this.fuel.equals(fuel)) {
            System.out.println("adding fuel");
        }  else {
            System.out.println("Wrong type of fuel");
        }
    }

    public void doRepair() {
        System.out.println("Repairing");
    }

    @Override
    public void sound() {
        System.out.println("Sport car doing brrrr");
    }
}
