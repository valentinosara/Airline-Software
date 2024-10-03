package uniquePackage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Plane uniquePlane = new Plane("american");
		Airline american = new Airline(uniquePlane); 
		
		System.out.println(american.freeWindowSeats());
		
		american.addReservation(new Reservation("1", "661651684", 2));
		american.addReservation(new Reservation("2", "661651684", 7));
		american.addReservation(new Reservation("3", "661651684", 2));
		american.addReservation(new Reservation("4", "661651684", 9));
		american.addReservation(new Reservation("5", "661651684", 6));
		american.addReservation(new Reservation("6", "661651684", 1));
		american.addReservation(new Reservation("7", "661651684", 36));
		american.addReservation(new Reservation("8", "661651684", 12));
		
		american.assign();
		System.out.println(american.freeWindowSeats());
		
		uniquePlane.showSeats();
	}

}
