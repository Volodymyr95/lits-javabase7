package ua.lits.lesson5;

import ua.lits.lesson5.encapsulation.FakeHttpClient;
import ua.lits.lesson5.inheritance.Bmw30;
import ua.lits.lesson5.inheritance.BmwX5;
import ua.lits.lesson5.inheritance.BmwX9;

public class Lesson5Main {

    public static void main(String[] args) {

      /*   Inheritance
        BmwX5 bmwX5 = new BmwX5(2012, 260);
        BmwX9 bmwX9 = new BmwX9(2015, 260,true);
        System.out.println(bmwX9.maxSpeed);
        bmwX9.start();

        Bmw30 bmw30 = new Bmw30(2030,360,true,true);
        */

        FakeHttpClient fakeHttpClient = new FakeHttpClient("amazon.com/deerfer");

        fakeHttpClient.getUrl();

    }
}
