package SalesExample;

public class RegularPrice implements SalesState {

	@Override
	public double getPrice(Item item, double price) {
		return price;
	}
}
