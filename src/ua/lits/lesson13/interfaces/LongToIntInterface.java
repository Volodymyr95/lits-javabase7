package ua.lits.lesson13.interfaces;

@FunctionalInterface
public interface LongToIntInterface extends OneInterface, TwoInterface {
    Integer apply(Long a);

    @Override
    default void doSomeDefaultAction() {
        OneInterface.super.doSomeDefaultAction();
        System.out.println("DefaultAction");
    }
}
