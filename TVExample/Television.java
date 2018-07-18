package TVExample;

public class Television {

	private Show program;

	public Television(Show program) {
		this.program = program;
	}

	public void setState(Show program) {
		this.program = program;
	}

	public void watch() {
		program.watch(this);
	}
}
