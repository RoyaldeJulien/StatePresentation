package BadExample;

public class Item {

	private double price;
	private boolean isOnSale;
	private double percentOff;


	public Item(double price, boolean state) {
		this.price = price;
		this.isOnSale = state;
	}

	public Item(double price) {
		this(price, false);
	}

	public void setOnSale(boolean state) {
		if (state == false) {
			percentOff = 0;
		}
		this.isOnSale = state;
	}

	public void setPercentOff(double percentOff) {
		if(isOnSale == true) {
			this.percentOff = percentOff;
		}
	}

	public double getPrice() {
		return price*(1 - percentOff);
	}
}
