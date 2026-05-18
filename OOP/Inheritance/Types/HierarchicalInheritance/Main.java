package OOP.Inheritance.Types.HierarchicalInheritance;

public class Main {
    public static void main(String[] args) {

        // Dog object
        Dog d1 = new Dog("Tommy", 3, "Labrador");

        System.out.println();

        d1.eat();
        d1.bark();
        d1.displayAnimal();
        d1.displayDog();

        System.out.println();
        System.out.println();

        // Cat object
        Cat c1 = new Cat("Kitty", 2, "White");

        System.out.println();

        c1.eat();
        c1.meow();
        c1.displayAnimal();
        c1.displayCat();
    }
}
