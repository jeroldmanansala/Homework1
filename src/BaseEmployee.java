class BaseEmployee extends Employee {
	
	private int baseSalary;
	
	public BaseEmployee(String firstName, String lastName, String SSNumber, int baseSalary) {
		super(firstName, lastName, SSNumber);
		this.baseSalary = baseSalary;
	}
	
	public int getBaseSalary() {
		return baseSalary;
	}
	
	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	
}
