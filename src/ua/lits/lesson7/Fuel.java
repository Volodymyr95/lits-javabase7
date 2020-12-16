package ua.lits.lesson7;

public enum Fuel {
    PETROL("P"),
    DIESEL("D");

    private String name;

    Fuel (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Fuel findByName(String name) {
        for(Fuel f: Fuel.values()) {
            if (f.getName().equals(name)) {
                return f;
            }
        }
        throw new IllegalArgumentException();
    }
}
