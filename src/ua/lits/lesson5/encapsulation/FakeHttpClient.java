package ua.lits.lesson5.encapsulation;

public class FakeHttpClient {

    String url;

    public FakeHttpClient(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        if(url.length() == 1) {
            System.out.println("wrong url");
        }
        this.url = url;
    }
}
