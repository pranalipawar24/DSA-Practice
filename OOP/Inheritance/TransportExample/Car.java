package OOP.Inheritance.TransportExample;

public class Car extends Vehicle {

    int noOfDoors;
    String transmissionType;

    // Constructor
    Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType) {

        super(name, model, noOfTyres);

        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
    }

    // Extra method
    void startAC() {
        System.out.println("AC started in " + name);
    }
}
