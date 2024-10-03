package uniquePackage;

public class Plane {
	private static int ROWS = 6;
	private static int COLUMNS = 16;
	private String company;
	private Seat[][] seats;
	
	public Plane(String company) {
		this.company = company;
	}
	
	public void reserveSeat(int seatNum) {
		Seat wantedSeat = searchSeat(seatNum);
		if (wantedSeat != null && wantedSeat.isFree()) {
			wantedSeat.reserve();
		}
	}
	
	private Seat searchSeat(int seatNum) {
		Seat wantedSeat = null;
		int n = (seatNum - 1) / COLUMNS;
		if (n < ROWS && n >= 0) {
			wantedSeat = seats[n][(seatNum - 1) % COLUMNS];
		}
		return wantedSeat;
	}
}
