package ua.lits.lesson19;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    //      Thread thread = new Thread();
    //      thread.start();

    //      Thread thread1 = new OurFirstThread();
    //      thread1.start();
    //
    //      Runnable one = new MyRunnable();
    //      Runnable two = () -> System.out.println("Our lambda runnable ");
    //      Runnable three = new Runnable() {
    //          @Override
    //          public void run() {
    //              System.out.println("Our anonimus class runnable ");
    //          }
    //      };
    //      Thread thread = new Thread(one);
    //      thread.start();
    //      Thread thread2 = new Thread(two);
    //      thread2.start();
    //      Thread thread3 = new Thread(three);
    //      thread3.start();
    //
    //    Thread thread =
    //        new Thread("Our first thread") {
    //          public void run() {
    //            System.out.println("run by:" + getName());
    //          }
    //        };
    //    thread.start();
    //      Thread thread = Thread.currentThread();
    //      System.out.println(thread.getName());
    //      for (int i = 0; i < 10; i++) {
    //          new Thread(String.valueOf(i)) {
    //              public void run() {
    //                  System.out.println("Thread:" + getName());
    //              }
    //          }.start();
    //      }

    //      MyRunnable myRunnable = new MyRunnable();
    //      Thread thread = new Thread(myRunnable);
    //      thread.start();
    //      Thread.sleep(5000);
    //      myRunnable.stop();
    Runtime.getRuntime().addShutdownHook(new FirstShutDownHook());

    Counter counter = new Counter();

    for (int i = 0; i < 10; i++) {
      Thread t = new Thread(new RunnableCounter(counter, i + 1), String.valueOf(i + 1));
//      t.setUncaughtExceptionHandler(
//          (thread, ex) -> {
//            System.out.println(thread.getName() + ", ex: " + ex.getMessage());
//          });
      t.start();
    }

    Thread.currentThread().join();

    System.out.println(counter.getCount());
  }
}
