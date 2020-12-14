package ua.lits.lesson6.notification;

public class SmsMessenger  implements Mesenger {

    @Override
    public void sentMsg(String msg) {
        System.out.println("SMS");
    }

}
