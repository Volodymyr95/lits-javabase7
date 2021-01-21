package ua.lits.lesson14;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String fullName;
    private List<Book> books = new ArrayList<>();

    public Author(String fullName, List<Book> books) {
        this.fullName = fullName;
        this.books = books;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
