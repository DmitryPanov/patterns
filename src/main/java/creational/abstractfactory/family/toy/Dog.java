package creational.abstractfactory.family.toy;

public class Dog implements Animal{
    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Gav";
    }
}
