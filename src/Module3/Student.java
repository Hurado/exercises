package Module3;

public class Student implements Comparable<Student> {
    private int age;
    private int height;
    private String name;
    private String lastName;


    public Student(int age, int height, String name, String lastName) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }
    public String getlastName() {
        return lastName;
    }

    public int compareTo(Student student) {
        int lastNameComparison = this.lastName.compareTo(student.lastName);
        if(lastNameComparison == 0) {
            return Integer.compare(this.age, student.age);

        }
        return lastNameComparison;
    }
    @Override
    public String toString() {
        return name + " " + lastName + ", Age: " + age + ", Height:" + height;
    }
}
