package OOP.Inheritance.Types.SingleInheritance;

class Animal {

    // Data members
    String name;
    int age;

    // Parent Constructor
    Animal(String name, int age) {

        // this keyword refers to current object
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
