package creational.abstractfactory;


import creational.abstractfactory.family.color.Black;
import creational.abstractfactory.family.color.Brown;
import creational.abstractfactory.family.color.Color;
import creational.abstractfactory.family.color.White;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String type) {
        if ("White".equalsIgnoreCase(type)) {
            return new White();
        } else if ("Brown".equalsIgnoreCase(type)) {
            return new Brown();
        } else if ("Black".equalsIgnoreCase(type)) {
            return new Black();
        }
        return null;
    }
}
