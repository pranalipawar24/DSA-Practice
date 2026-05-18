package OOP.Inheritance.TransportExample;

public class MotorCycle extends Vehicle {

    String handleBarStyle;

    // Constructor
    MotorCycle(String name, String model, int noOfTyres, String handleBarStyle) {

        super(name, model, noOfTyres);

        this.handleBarStyle = handleBarStyle;
    }

    // Extra method
    void wheelie() {
        System.out.println(name + " is doing Wheelie!");
    }
}
