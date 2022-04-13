public class Product_ {
	private int quantity;
	private double itemPrice;

	public Product_(int quantity, double itemPrice) {
		this.quantity = quantity;
		this.itemPrice = itemPrice;
	}
	
	public double calculateTotalPrice() {
		if (this.basePrice() > 1000) {
			return this.basePrice() * 0.95f;
		} else {
			return this.basePrice() * 0.98f;
		}
	}

	public double calculateTotalTax() {
		if (this.basePrice() > 10000) {
			return this.basePrice() * 0.20f;
		} else {
			return this.basePrice() * 0.15f;
		}		
	}

	private double basePrice() {
		return this.quantity*this.itemPrice;
	}
}
