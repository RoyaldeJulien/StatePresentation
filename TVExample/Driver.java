package TVExample;

public class Driver {

	public static void main(String[] args) {

		Television TV = new Television(new SpongeBobSquarePants());

		for (int i = 0; i < 90; i++) {
			TV.watch();
		}
	}
}
