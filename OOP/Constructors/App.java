package OOP.Constructors;

// Main class
public class App {

    public static void main(String[] args) {

        // Object using default constructor
        Student s1 = new Student();

        s1.display();

        System.out.println();

        // Object using parameterized constructor
        Student s2 = new Student(101, "Rahul");

        s2.display();

        System.out.println();

        // Object using copy constructor
        Student s3 = new Student(s2);

        s3.display();
    }
}
