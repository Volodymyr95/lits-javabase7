package ua.lits.lesson19;

public class RunnableCounter implements Runnable {

    private Counter counter;

    private Integer i;
    public RunnableCounter(Counter counter, Integer i) {
        this.counter = counter;
        this.i = i;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
//            if (this.i == 1) {
//                throw new IllegalStateException("Something went wrong");
//            }
            try {
                counter.add(this.i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
