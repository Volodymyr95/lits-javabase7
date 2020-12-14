package ua.lits.lesson6.notification;

public class MailMessenger implements Mesenger {
    @Override
    public void sentMsg(String msg) {
        System.out.println("Mail");
    }
}
