package ua.lits.lesson13.interfaces;

public interface TwoInterface {
    default void doSomeDefaultAction() {
        System.out.println("DefaultAction for TwoInterface");
    }
}
