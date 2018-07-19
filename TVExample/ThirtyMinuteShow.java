package TVExample;

public abstract class ThirtyMinuteShow implements Show {

	private int minutesRemaining = 30;
	protected String name;

	protected abstract Show nextShow();

	@Override
	public void watch(Television TV) {
		System.out.println("Watching " + name + "...");
		if(minutesRemaining == 4) {
			TV.setState(new Commercial(3, nextShow()));
		}
		else if(((minutesRemaining - 3) % 10) == 1) {
			minutesRemaining -= 4;
			TV.setState(new Commercial(3, this));
		}
		else {
			minutesRemaining--;
		}
	}
}
