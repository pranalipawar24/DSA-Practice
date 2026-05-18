package OOP.Inheritance.Types.MultilevelInheritance;

class Dog extends Animal {

    // Data member
    String breed;

    // Constructor
    Dog(String name, String breed) {
        // Calling parent constructor
        super(name);
        this.breed = breed;
        System.out.println("Dog Constructor Called");
    }

    // Method
    void bark() {
        System.out.println(name + " is barking");
    }
}