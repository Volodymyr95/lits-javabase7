package ua.lits.lesson6.notification;

public class MainNotification {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();


        notificationService.sent(new WAMessnger());
        notificationService.sent(new TelegramMessenger());
    }
}
