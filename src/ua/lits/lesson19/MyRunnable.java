package ua.lits.lesson19;

public class MyRunnable implements Runnable {

    private boolean isRunning = false;

    public void stop() {
        isRunning = false;
    }

    private boolean isRunning() {
        return isRunning;
    }

    @Override
    public void run() {
        isRunning = true;
        while (isRunning()) {
            System.out.println("Running...");
        }
    }
}
