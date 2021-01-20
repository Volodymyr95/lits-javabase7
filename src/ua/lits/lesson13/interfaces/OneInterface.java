package ua.lits.lesson13.interfaces;

public interface OneInterface {
    default void doSomeDefaultAction() {
        System.out.println("DefaultAction for OneInterface");
    }
}
