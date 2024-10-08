package uniquePackage;

import java.util.ArrayList;

public class Airline {
	private Plane plane;
	private ArrayList<Reservation> reservations;
	
	public Airline(Plane plane) {
		this.plane = plane;
		this.reservations = new ArrayList<Reservation>();
	}

	public void assign() {
		for (Reservation r : reservations) {
			plane.reserveSeat(r.getSeatNumber());
		}
	}
	
	public int freeWindowSeats() {
		return plane.freeWindowSeats();
	}
	
	public void addReservation(Reservation r) {
		reservations.add(r);
	}
}
