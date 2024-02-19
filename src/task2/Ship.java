package task2;

public class Ship {

	private String shipName;
	private String yearBuilt;
	
	public Ship(String shipName, String yearBuilt) {
		this.shipName = shipName;
		this.yearBuilt = yearBuilt;
	}
	
	//getters and setters
	
	public String getShipName() {
		return shipName;
	}
	
	public String getYearBuilt() {
		return yearBuilt;
	}
	
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	
	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	
	public void printInfo() {
		System.out.println("Ship name: " + shipName);
		System.out.println("Year built: " + yearBuilt);
		System.out.println();
		
	}
}
	


