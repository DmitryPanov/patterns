package creational.abstractfactory;

import creational.abstractfactory.family.color.Color;
import creational.abstractfactory.family.toy.Animal;

public class AbstractPatterApi {
    public static void main(String[] args) {
        AbstractFactory abstractFactory;

        //creating a brown toy dog
        abstractFactory = FactoryProvider.getFactory("Toy");
        Animal toy =(Animal) abstractFactory.create("Dog");

        abstractFactory = FactoryProvider.getFactory("Color");
        Color color =(Color) abstractFactory.create("Brown");

        String result = "A " + toy.getType() + " with " + color.getColor() + " color sound " + toy.makeSound();

        System.out.println(result);
    }
}
