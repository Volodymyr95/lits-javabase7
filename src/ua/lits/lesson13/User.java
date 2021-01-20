package ua.lits.lesson13;

import java.util.function.Supplier;

public class User {
    private String firstName;
    private String lastName;
    private Supplier<Mark> mark = () -> new Mark("Math", 3);

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Mark getMarkFromMath() {
        return mark.get();
    }

}
