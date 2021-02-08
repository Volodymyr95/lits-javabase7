package ua.lits.lesson19;

public class ImutableObject {
    private final int value;

    public ImutableObject(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
