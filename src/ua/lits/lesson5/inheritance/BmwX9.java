package ua.lits.lesson5.inheritance;

public class BmwX9 extends BmwX5 {

    public boolean isOffroad = true;

    public BmwX9(int year, int maxSpeed, boolean isOffroad) {
        super(year,maxSpeed);
        this.isOffroad = isOffroad;
    }

    public void offRoadDrive() {
        if(isOffroad) {
            System.out.println("Offroad allowed");
        } else {
            System.out.println("Offroad not allowed");
        }
    }

}
