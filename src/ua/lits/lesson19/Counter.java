package ua.lits.lesson19;

public class Counter {
    private Integer count = 0;
    private Object lock = new Object();

    public Integer getCount() {
        return count;
    }

    public void add(Integer v) throws InterruptedException {
        synchronized (lock) {
            System.out.println("Thread: " + Thread.currentThread().getName());
            Thread.sleep(300);
            count = count + v;
        }

    }
}
