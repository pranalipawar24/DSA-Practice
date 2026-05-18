package OOP.Inheritance.TransportExample;

public class Vehicle {

    String name;
    String model;
    int noOfTyres;

    // Constructor
    Vehicle(String name, String model, int noOfTyres) {
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    // Methods
    void startEngine() {
        System.out.println("Engine started of " + name);
    }

    void stopEngine() {
        System.out.println("Engine stopped of " + name);
    }
}
