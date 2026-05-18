package OOP.Inheritance.Types.MultipleInheritance;

public class Main {
    public static void main(String[] args) {

        // Creating object
        Child c1 = new Child("Rahul");

        System.out.println();

        // Calling methods
        c1.showFatherQuality();
        c1.showMotherQuality();
        System.out.println();
        c1.display();
    }
}
