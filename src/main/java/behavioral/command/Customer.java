package behavioral.command;

public class Customer {
	Waitress waitress;
	Cook cook;
	Order o;
	public Customer(Waitress waitress, Cook cook) {
		this.waitress = waitress;
		this.cook = cook;
	}
	public void createOrder() {
		 o = () -> {
			 cook.makeBurger();
			 cook.makeFries();
		 };
	}
	public void hungry() {
		waitress.takeOrder(o);
	}
}