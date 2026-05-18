package OOP.Inheritance.Types.HierarchicalInheritance;

class Dog extends Animal {

    // Data member
    String breed;

    // Constructor
    Dog(String name, int age, String breed) {
        // Calling parent constructor
        super(name, age);
        this.breed = breed;
        System.out.println("Dog Constructor Called");
    }

    // Method
    void bark() {
        System.out.println(name + " is barking");
    }

    // Method
    void displayDog() {
        System.out.println("Dog Breed : " + breed);
    }
}
