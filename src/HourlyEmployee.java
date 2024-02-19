class HourlyEmployee extends Employee {
	
	private int wage;
	private int hoursWorked;

	public HourlyEmployee(String firstName, String lastName, String SSNumber, int wage, int hoursWorked) {
		super(firstName, lastName, SSNumber);
		this.wage = wage;
		this.hoursWorked = hoursWorked;
	}
	
	// getters and setters
	
	public int getWage() {
		return wage;
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	
	public void setWage(int wage) {
		this.wage = wage;
	}
	
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
}
