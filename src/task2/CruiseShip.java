package task2;

class CruiseShip extends Ship {
	
	private int maxPassengers;

	public CruiseShip(String shipName, String yearBuilt, int maxPassengers) {
		super(shipName, yearBuilt);
		this.maxPassengers = maxPassengers;
	}
	
	//getters and setters
	
	public int getMaxPassengers() {
		return maxPassengers;
	}
	
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Ship name: " + getShipName());
		System.out.println("Max passengers: " + maxPassengers);
		System.out.println();
	}

}
