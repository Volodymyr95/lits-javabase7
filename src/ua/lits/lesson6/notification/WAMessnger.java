package ua.lits.lesson6.notification;

public class WAMessnger implements Mesenger {
    @Override
    public void sentMsg(String msg) {
        System.out.println("WA");
    }
}
