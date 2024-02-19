package task2;

public class Main {

	public static void main(String[] args) {
		
		//create array
		Ship[] ship = new Ship[3];
		
		//initiate
		ship[0] = new Ship("Ship", "1944");
		ship[1] = new CruiseShip("Cruise Ship", "1999", 1500);
		ship[2] = new CargoShip("Cargo Ship", "2002", 6000);

		
		for (int i = 0; i < 2; i++) {
			ship[i].printInfo();
		}
	}

}
