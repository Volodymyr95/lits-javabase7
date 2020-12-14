package ua.lits.lesson6.figure;

public interface Figure {
    int x = 1; //
    void area();

    default void test() {
    }
}

/*
1 - abstract, cannot create object
2 - methods doesn't have body, only defaults
3 - fields are final




 */
