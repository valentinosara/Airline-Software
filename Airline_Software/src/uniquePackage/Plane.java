package uniquePackage;

import java.util.Arrays;

public class Plane {
	private static int ROWS = 16;
	private static int COLUMNS = 6;
	private String company;
	private Seat[][] seats;

	public Plane(String company) {
		this.company = company;
		this.seats = new Seat[ROWS][COLUMNS];
		this.completeSeats();
	}

	public void reserveSeat(int seatNum) {
		Seat wantedSeat = searchSeat(seatNum);
		if (wantedSeat != null && wantedSeat.isFree()) {
			wantedSeat.reserve();
		} else {
			System.out.println("The seat " + seatNum + " does not exists or is ocupate");
		}
	}

	private Seat searchSeat(int seatNum) {
		Seat wantedSeat = null;
		if (seatNum > 0) {
			int n = (seatNum - 1) / COLUMNS;
			if (n < ROWS && n >= 0) {
				wantedSeat = seats[n][(seatNum - 1) % COLUMNS];
			}
		}

		return wantedSeat;
	}

	public int freeWindowSeats() {
		int seats = 0;
		for (int i = 0; i < COLUMNS; i += (COLUMNS - 1)) {
			System.out.println("i actual: " + i);
			for (Seat[] row : this.seats) {
				if (row[i].isFree()) {
					seats++;
				}
			}
		}
		return seats;
	}

	private void completeSeats() {
		for (int i = 1; i <= ROWS * COLUMNS; i++) {
			int seatRow = (i - 1) / COLUMNS;
			int seatColumn = (i - 1) % COLUMNS;
			seats[seatRow][seatColumn] = new Seat(State.FREE);
		}
	}

	public void showSeats(){
		int i = 0;
		for (Seat[] row : seats) {
			for (Seat seat : row) {
				i++;
				System.out.println(i);
				System.out.println(seat);
			}
		}
	}
	
	
}
