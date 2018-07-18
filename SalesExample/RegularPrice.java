package SalesExample;

public class RegularPrice implements SalesState {

	@Override
	public double getPrice(Item item) {
		return item.getRawPrice();
	}
}
