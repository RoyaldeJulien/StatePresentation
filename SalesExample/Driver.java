package SalesExample;

public class Driver {

	public static void main(String[] args) {

		Item item = new Item(500);

		System.out.println(item.getPrice());
		item.setState(new OnSale(.5));
		System.out.println(item.getPrice());
		item.setState(new RegularPrice());
		System.out.println(item.getPrice());

	}
}
