package TVExample;

public class Commercial implements Show {

	private int minutesRemaining;
	private Show interruptedprogram;

	public Commercial(int minutesRemaining, Show interruptedprogram) {
		this.minutesRemaining = minutesRemaining;
		this.interruptedprogram = interruptedprogram;
	}

	@Override
	public void watch(Television TV) {
		System.out.println("Watching Commercials...");
		if (minutesRemaining == 1) {
			TV.setState(interruptedprogram);
		}
		else {
			minutesRemaining--;
		}
	}

}
