package BadExample;

public class Driver {

	public static void main(String[] args) {

		Item item = new Item(500);

		System.out.println(item.getPrice());
		item.setOnSale(true);
		item.setPercentOff(.5);
		System.out.println(item.getPrice());
		item.setOnSale(false);
		System.out.println(item.getPrice());
	}
}
