package SalesExample;

public class OnSale implements SalesState {

	private double percentOff;

	public OnSale(double percentOff) {
		this.percentOff = percentOff;
	}

	@Override
	public double getPrice(Item item) {
		return item.getRawPrice()*(1 - percentOff);
	}
}
