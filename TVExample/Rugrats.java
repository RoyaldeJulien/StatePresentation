package TVExample;

public class Rugrats extends ThirtyMinuteShow {

	public Rugrats() {
		name = "Rugrats";
	}

	@Override
	protected Show nextShow() {
		return new SpongeBobSquarePants();
	}
}
