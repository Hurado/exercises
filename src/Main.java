import Module2.FibonacciSequence;
import Module3.Student;
import Module3.TodoList;
import Module3.sumOFArray;
import Module3.wordCounter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(20,167, "John", "Doe"));
        students.add(new Student(21,171, "Ewa", "Pajor"));
        students.add(new Student(19,192, "Paweł", "Marciniak"));
        students.add(new Student(22,178, "Marek", "Komandos"));
        students.add(new Student(19,190, "Szymon", "Doe"));

        System.out.println("Before sorting:");
        for(Student s : students) {
            System.out.println(s);
        }
        Collections.sort(students);

        System.out.println("After sorting:");
        for(Student s : students) {
            System.out.println(s);
        }
    }
}