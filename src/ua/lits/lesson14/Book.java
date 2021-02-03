package ua.lits.lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Book {
    private String title;
    private List<String> genre = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, List<String> genre) {
        this.title = title;
        this.genre = genre;
    }

//    public String getTitle() {
//        return title;
//    }

    public Optional<String> getTitle() {
        return Optional.ofNullable(title);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }
}
//Users/volodymyrrachuk/Study/lits/JB007/src/ua/lits/lesson14/Author.java