
class SalariedEmployee extends Employee {
	
	private int weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String SSNumber, int weeklySalary ) {
		super(firstName, lastName, SSNumber);
		this.weeklySalary = weeklySalary;
	}
	
	//getters and setters
	
	public int getWeeklySalary() {
		return weeklySalary;
	}
	
	public void setWeeklySalary(int weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
}
