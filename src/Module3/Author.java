package Module3;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private int age;
    private String favouriteGenre;
    private List<Book> books;



    public Author(String name, int age, String favouriteGenre) {
        this.name = name;
        this.age = age;
        this.favouriteGenre = favouriteGenre;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFavouriteGenre() {
        return favouriteGenre;
    }

    public List<Book> getBooks() {
        return books;
    }
    public void addBook(Book book) {
        books.add(book);
    }
}
