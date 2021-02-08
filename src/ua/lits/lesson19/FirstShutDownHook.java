package ua.lits.lesson19;

public class FirstShutDownHook extends Thread {

    public void run() {
        System.out.println("FirstShutDownHook");
    }
}
