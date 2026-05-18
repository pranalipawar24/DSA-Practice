package OOP.Inheritance.Types.HierarchicalInheritance;

class Cat extends Animal {

    // Data member
    String color;

    // Constructor
    Cat(String name, int age, String color) {
        // Calling parent constructor
        super(name, age);
        this.color = color;
        System.out.println("Cat Constructor Called");
    }

    // Method
    void meow() {
        System.out.println(name + " says meow");
    }

    // Method
    void displayCat() {
        System.out.println("Cat Color : " + color);
    }
}
