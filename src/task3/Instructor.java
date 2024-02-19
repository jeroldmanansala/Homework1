package task3;

public class Instructor {

	private String firstName;
	private String lastName;
	private String officeNum;
	
	public Instructor(String firstName, String lastName, String officeNum) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.officeNum = officeNum;
	}
	
	//getters and setters

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getOfficeNum() {
		return officeNum;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setOfficeNum(String officeNum) {
		this.officeNum = officeNum;
	}
}
