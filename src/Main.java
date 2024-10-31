import Module2.FibonacciSequence;
import Module3.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<Student> students = new ArrayList<>();
//        students.add(new Student(20,167, "John", "Doe"));
//        students.add(new Student(21,171, "Ewa", "Pajor"));
//        students.add(new Student(19,192, "Paweł", "Marciniak"));
//        students.add(new Student(22,178, "Marek", "Komandos"));
//        students.add(new Student(19,190, "Szymon", "Doe"));
//
//        System.out.println("Before sorting:");
//        for(Student s : students) {
//            System.out.println(s);
//        }
//        Collections.sort(students);
//
//        System.out.println("After sorting:");
//        for(Student s : students) {
//            System.out.println(s);
//        }

        Library library = new Library();

        Author author1 = new Author("Tolkien", 46, "Fantasy");
        Author author2 = new Author("J.K. Rowling", 58, "Fantasy");

        library.addAuthor(author1);
        library.addAuthor(author2);

        library.addBookToAuthor("Tolkien", new Book("The Lords Of The Rings: part 1", "Tolkien", "Fantasy", 328));
        library.addBookToAuthor("Tolkien", new Book("The Lords Of The Rings: part 2", "Tolkien", "Fantasy", 350));
        library.addBookToAuthor("J.K. Rowling", new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy", 309));
        library.addBookToAuthor("J.K. Rowling", new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling", "Fantasy", 341));

        System.out.println("Books by Tolkien:");
        for (Book book : library.getBooksOfAuthor("Tolkien")) {
            System.out.println(book);
        }

        System.out.println("All authors in the library:");
        for (String authorName : library.getAllAuthors()) {
            System.out.println(authorName);
        }
    }
}