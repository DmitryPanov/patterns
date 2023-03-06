package creational.factorymethod;

public abstract class MotorVehicleFactory {
    public MotorVehicle create() {
        MotorVehicle motorVehicle = createMotorVehicle();
        motorVehicle.build();
        return motorVehicle;
    }

    protected abstract MotorVehicle createMotorVehicle();
}
