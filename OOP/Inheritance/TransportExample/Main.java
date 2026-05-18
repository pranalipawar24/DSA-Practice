package OOP.Inheritance.TransportExample;

public class Main {

    public static void main(String[] args) {

        // Car object
        Car c = new Car("Maruti", "800", 4, 5, "Automatic");

        c.startEngine();
        c.startAC();
        c.stopEngine();

        System.out.println();

        // MotorCycle object
        MotorCycle m = new MotorCycle("Splendor", "Xline", 2, "Sports");

        m.startEngine();
        m.wheelie();
        m.stopEngine();
    }
}
