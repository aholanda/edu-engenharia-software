public class _Product {
	private int quantity;
	private double itemPrice;
	
	public _Product(int quantity, double itemPrice) {
		this.quantity = quantity;
		this.itemPrice = itemPrice;
	}
	
	public double calculateTotalPrice() {
		// Change here must be made also in calculateTotalTax()
		double basePrice = this.quantity * this.itemPrice;
		if (basePrice > 1000) {
			return basePrice * 0.95f;
		} else {
			return basePrice * 0.98f;
		}
	}

	public double calculateTotalTax() {
		double basePrice = this.quantity * this.itemPrice;
		if (basePrice > 10000) {
			return basePrice * 0.20f;
		} else {
			return basePrice * 0.15f;
		}		
	}
}
