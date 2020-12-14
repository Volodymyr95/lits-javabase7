package ua.lits.lesson6.figure;

public class FigureMain {
    public static void main(String[] args) {
        Figure figure;
        
        figure = new Triagle();


        figure.area();

        System.out.println("------------------");

        figure = new Square();

        figure.area();



    }
}
