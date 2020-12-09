package ua.lits.lesson5.inheritance;

public class Bmw30 extends BmwX9 {

    public boolean isCanSwim;

    public Bmw30(int year, int maxSpeed, boolean isOffroad, boolean isCanSwim) {
        super(year, maxSpeed, isOffroad);
        this.isCanSwim = isCanSwim;
    }


    public void swim() {
        if (isCanSwim) {
            System.out.println("Swim");
        } else {
            System.out.println("Cannot swim");
        }
    }
}
/// a) Bmwx5   b) Bmwx
//
// 9

/*
Bmwx5 (Base)
     ->
        BmwX9 (Sub class BmwX5)
            ->
                BmwX30 (Sub X5 and X9)


 */