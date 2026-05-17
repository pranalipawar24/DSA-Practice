package OOP.Constructors;

// Student class
class Student {

    // Data members
    int id;
    String name;

    // Default Constructor
    Student() {
        this.id = 0;
        this.name = "Not Assigned";

        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    Student(int i, String n) {
        this.id = i;
        this.name = n;

        System.out.println("Parameterized Constructor Called");
    }

    // Copy Constructor
    Student(Student s) {
        this.id = s.id;
        this.name = s.name;

        System.out.println("Copy Constructor Called");
    }

    // Method to display data
    void display() {
        System.out.println("Student ID : " + id);
        System.out.println("Student Name : " + name);
    }
}


