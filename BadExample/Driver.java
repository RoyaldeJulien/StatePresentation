package BadExample;

public class Driver {

	public static void main(String[] args) {

		Item item = new Item(500);

		System.out.println(item.getSalesPrice());
		item.setState(State.ONSALE);
		item.setPercentOff(.5);
		System.out.println(item.getSalesPrice());
		item.setState(State.REGULARPRICE);
		System.out.println(item.getSalesPrice());
	}
}
