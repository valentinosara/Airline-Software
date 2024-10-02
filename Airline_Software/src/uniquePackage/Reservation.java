package uniquePackage;

public class Reservation {
	private String id;
	private String clientDni;
	private int seatNumber;
	
	public Reservation(String id, String clientDni, int seatNumber) {
		this.id = id;
		this.clientDni = clientDni;
		this.seatNumber = seatNumber;
	}
	
	public int getSeatNumber(){
		return this.seatNumber;
	}
}
