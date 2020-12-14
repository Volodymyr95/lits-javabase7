package ua.lits.lesson6.notification;



public class TelegramMessenger implements Mesenger {

    @Override
    public void sentMsg(String msg) {
        System.out.println("Telegram");
    }

}
