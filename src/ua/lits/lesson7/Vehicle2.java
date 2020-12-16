package ua.lits.lesson7;

public interface Vehicle2 {
    void run();

    void addPetrol(AddingPetrol addingPetrol);

    private void printText(String text) {
        System.out.println(text);
    }

    static void doRepair() {
        System.out.println("doing repair");
    }
}
