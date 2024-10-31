package Module3;

public class Book {
    private final String title;
    private final String author;
    private String genre;
    private final int numberOfPages;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public Book(String title, String author, String genre, int pages) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.numberOfPages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
