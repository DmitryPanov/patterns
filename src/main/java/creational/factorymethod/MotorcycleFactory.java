package creational.factorymethod;

public class MotorcycleFactory extends MotorVehicleFactory{
    @Override
    protected MotorVehicle createMotorVehicle() {
        return new Motorcycle();
    }
}
