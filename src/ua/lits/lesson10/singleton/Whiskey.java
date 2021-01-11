package ua.lits.lesson10.singleton;

public class Whiskey {

    private static final Whiskey WHISKEY = new Whiskey();

    private Whiskey() {

    }

    public static Whiskey getInstance() {
        if (WHISKEY == null) {
            return new Whiskey();
        } else {
            return WHISKEY;
        }
    }


}
