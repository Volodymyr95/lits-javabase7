package ua.lits.lesson9.polimorphism;

import java.util.Objects;

public class Apple implements Fruit {

    private int size = 12;
    private String color = "Red";

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return size == apple.size &&
                Objects.equals(color, apple.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, color);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
