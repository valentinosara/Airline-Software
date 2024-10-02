package uniquePackage;

public class Seat {
	private State state;

	public Seat(State state) {
		this.state = state;
	}
	
	public boolean isFree() {
		return state.equals(State.FREE);
	}
}
