package Module3;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.Set;
import java.util.Comparator;


public class Library {

   private Map<String, Author> authorsMap;

   public Library() {
       authorsMap = new HashMap<>();
   }

   public void addAuthor (Author author) {
       authorsMap.put(author.getName(), author);
   }


    public void addBookToAuthor(String authorName, Book book) {
        Author author = authorsMap.get(authorName);
        if (author == null) {
            System.out.println("Author '" + authorName + "' not found");
        } else {
            author.addBook(book);
        }
    }

    public List<Book> getBooksOfAuthor (String authorname) {
        Author author = authorsMap.get(authorname);
        if (author != null) {
            List<Book> books = author.getBooks();
            books.sort(Comparator.comparingInt(Book::getNumberOfPages));
            return books;
        }
        return Collections.emptyList();
    }

    public Set<String> getAllAuthors() {
        return authorsMap.keySet();
    }

    public List<Book> getAllBooks() {
        List<Book> allBooks = new ArrayList<>();
        for (Author author : authorsMap.values()) {
            allBooks.addAll(author.getBooks());
        }
        return allBooks;
    }

    public Map<String, List<Book>> getAllBooksAndAuthors() {
        Map<String, List<Book>> booksByAuthor = new HashMap<>();
        for(Author author : authorsMap.values()) {
            booksByAuthor.put(author.getName(), author.getBooks());
        }
        return booksByAuthor;
    }
}
