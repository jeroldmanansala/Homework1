
public class Employee {
	private String firstName;
	private String lastName;
	private String SSNumber;
	
	public Employee(String firstName, String lastName, String SSNumber) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSNumber = SSNumber;
		
	}
	
	// getters and setters
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getSSNumber() {
		return SSNumber;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setSSnumber(String SSNumber) {
		this.SSNumber = SSNumber;
	}
}



