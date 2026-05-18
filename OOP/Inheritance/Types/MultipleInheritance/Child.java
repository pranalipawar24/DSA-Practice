package OOP.Inheritance.Types.MultipleInheritance;

class Child implements Father, Mother {

    // Data member
    String name;

    // Constructor
    Child(String name) {
        this.name = name;
        System.out.println("Child Constructor Called");
    }

    // Overriding Father interface method
    public void showFatherQuality() {
        System.out.println(name + " got discipline from father");
    }

    // Overriding Mother interface method
    public void showMotherQuality() {
        System.out.println(name + " got kindness from mother");
    }

    // Own method
    void display() {
        System.out.println("Child Name : " + name);
        System.out.println("Father Age : " + fatherAge);
        System.out.println("Mother Age : " + motherAge);
    }
}
