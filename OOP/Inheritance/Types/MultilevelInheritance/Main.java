package OOP.Inheritance.Types.MultilevelInheritance;

public class Main {

    public static void main(String[] args) {

        // Creating Puppy object
        Puppy p1 = new Puppy("Tommy", "Labrador", 2);

        System.out.println();

        // Animal class method
        p1.eat();

        // Dog class method
        p1.bark();

        // Puppy class method
        p1.display();
    }
}
