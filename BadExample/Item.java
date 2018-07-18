package BadExample;

enum State {
	REGULARPRICE,
	ONSALE;
}

public class Item {

	private double price;
	private State state;
	private double percentOff;


	public Item(double price, State state) {
		this.price = price;
		this.state = state;
	}

	public Item(double price) {
		this(price, State.REGULARPRICE);
	}

	public void setState(State state) {
		if (state == State.REGULARPRICE) {
			percentOff = 0;
		}
		this.state = state;
	}

	public void setPercentOff(double percentOff) {
		if(state == State.ONSALE) {
			this.percentOff = percentOff;
		}
	}

	public double getRawPrice() {
		return price;
	}

	public double getSalesPrice() {
		return price*(1 - percentOff);
	}
}
