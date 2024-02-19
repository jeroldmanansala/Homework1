package task2;

class CargoShip extends Ship{
	
	private int cargoCapacity;

	public CargoShip(String shipName, String yearBuilt, int cargoCapacity) {
		super(shipName, yearBuilt);
		this.cargoCapacity = cargoCapacity;
	}
	
	//getters and setters
	
	public int getCargoCapacity() {
		return cargoCapacity;
	}
	
	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("Ship name: " + getShipName());
		System.out.println("Cargo Capacity(Tons) " + cargoCapacity);
		
	}
}
