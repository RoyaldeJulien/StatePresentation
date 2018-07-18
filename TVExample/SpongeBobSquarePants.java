package TVExample;

public class SpongeBobSquarePants extends ThirtyMinuteShow {

	public SpongeBobSquarePants() {
		name = "SpongeBob Squarepants";
	}

	@Override
	protected Show nextShow() {
		return new Rugrats();
	}
}
