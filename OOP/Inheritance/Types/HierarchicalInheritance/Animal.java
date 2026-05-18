package OOP.Inheritance.Types.HierarchicalInheritance;

class Animal {

    // Data members
    String name;
    int age;

    // Constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal Constructor Called");
    }

    // Method
    void eat() {
        System.out.println(name + " is eating");
    }

    // Method
    void displayAnimal() {
        System.out.println("Animal Name : " + name);
        System.out.println("Animal Age : " + age);
    }
}
