package SalesExample;

public class Item {

	private SalesState state;
	private double price;

	public Item(double price, SalesState state) {
		this.price = price;
		this.state = state;
	}

	public Item(double price) {
		this(price, new RegularPrice());
	}

	public void setState(SalesState state) {
		this.state = state;
	}

	public double getPrice() {
		return state.getPrice(this, price);
	}
}
