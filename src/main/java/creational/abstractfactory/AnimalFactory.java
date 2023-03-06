package creational.abstractfactory;


import creational.abstractfactory.family.toy.Animal;
import creational.abstractfactory.family.toy.Bear;
import creational.abstractfactory.family.toy.Dog;
import creational.abstractfactory.family.toy.Duck;

public class AnimalFactory implements AbstractFactory<Animal> {
    @Override
    public Animal create(String type) {
        if ("Dog".equalsIgnoreCase(type)) {
            return new Dog();
        } else if ("Bear".equalsIgnoreCase(type)) {
            return new Bear();
        } else if ("Duck".equalsIgnoreCase(type)) {
            return new Duck();
        }
        return null;
    }
}
