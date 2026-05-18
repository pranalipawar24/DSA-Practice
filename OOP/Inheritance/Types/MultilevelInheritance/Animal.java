package OOP.Inheritance.Types.MultilevelInheritance;

class Animal {

    // Data members
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
        System.out.println("Animal Constructor Called");
    }

    // Method
    void eat() {
        System.out.println(name + " is eating");
    }
}
