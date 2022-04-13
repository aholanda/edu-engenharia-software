public class Main {
	public static void main(String args[]) {
		_Product hammer = new _Product(300, 3.75);
		Product_ notebook = new Product_(10000, 1.24);

		System.out.println("P1(total)=" + hammer.calculateTotalPrice() + ", tax(P1)=" + hammer.calculateTotalTax());
		System.out.println("P2(total)=" + notebook.calculateTotalPrice() + ", tax(P2)=" + notebook.calculateTotalTax());
	}
}
