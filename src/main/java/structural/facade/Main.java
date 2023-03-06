package structural.facade;

public class Main {
    /*
    Шаблон фасад (англ. Facade) — структурный шаблон проектирования,
    позволяющий скрыть сложность системы путём сведения всех возможных внешних
    вызовов к одному объекту, делегирующему их соответствующим объектам системы.
     */
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startComputer();
    }
}
