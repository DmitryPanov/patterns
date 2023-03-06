package creational.factorymethod;

public class App {
    public static void main(String[] args) {
        MotorVehicleFactory factory = new CarFactory();
        factory.create();
    }


}
