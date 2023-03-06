package creational.abstractfactory.family.toy;

public class Duck implements Animal{
    @Override
    public String getType() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Krya";
    }
}
