package OOP.Inheritance.Types.SingleInheritance;

public class Main {

    public static void main(String[] args) {

        // Creating Dog object
        Dog d1 = new Dog("Tommy", 3, "Pug");

        System.out.println();

        // Parent class methods
        d1.eat();
        d1.displayAnimal();

        System.out.println();

        // Child class methods
        d1.bark();
        d1.displayDog();
    }
}