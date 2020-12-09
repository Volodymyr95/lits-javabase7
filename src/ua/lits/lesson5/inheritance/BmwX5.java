package ua.lits.lesson5.inheritance;

public class BmwX5 {

    private int year;
    private int maxSpeed;

    public BmwX5() {
    }

    public BmwX5(int year, int maxSpeed) {
        this.year = year;    // year = year; // year from constructor arg;   this.year = year = BWM.year = year;
        this.maxSpeed = maxSpeed;
    }

    public void start() {
        System.out.println("Start");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
