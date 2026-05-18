package OOP.Inheritance.Types.MultilevelInheritance;

class Puppy extends Dog {

    // Data member
    int age;

    // Constructor
    Puppy(String name, String breed, int age) {
        // Calling Dog constructor
        super(name, breed);
        this.age = age;
        System.out.println("Puppy Constructor Called");
    }

    // Method
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Breed : " + breed);
        System.out.println("Age : " + age);
    }
}
