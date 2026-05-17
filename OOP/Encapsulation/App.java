package OOP.Encapsulation;

public class App {

    public static void main(String[] args) {

        Student s1 = new Student();

        // Setting values
        s1.setId(101);
        s1.setName("Pranali");

        // Calling getter methods
        s1.getId();
        s1.getName();
    }
}
