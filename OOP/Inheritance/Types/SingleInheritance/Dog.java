package OOP.Inheritance.Types.SingleInheritance;

class Dog extends Animal {

    // Child class data member
    String breed;

    // Child Constructor
    Dog(String name, int age, String breed) {

        // Calls parent constructor
        super(name, age);

        // Current class variable
        this.breed = breed;

        System.out.println("Dog Constructor Called");
    }

    // Child class method
    void bark() {
        System.out.println(name + " is barking");
    }

    // Display method
    void displayDog() {
        System.out.println("Dog Breed : " + breed);
    }
}