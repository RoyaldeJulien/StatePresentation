package BadExample;

public class Driver {

	public static void main(String[] args) {

		Item item = new Item(500);

		System.out.println(item.getSalesPrice());
		item.setState(true);
		item.setPercentOff(.5);
		System.out.println(item.getSalesPrice());
		item.setState(false);
		System.out.println(item.getSalesPrice());
	}
}
