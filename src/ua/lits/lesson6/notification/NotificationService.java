package ua.lits.lesson6.notification;

public class NotificationService {

   private Mesenger mesenger;


    public void sent(Mesenger mesenger) {
        this.mesenger = mesenger;
        mesenger.sentMsg("");
    }


}
