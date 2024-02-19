package task3;

public class Course {
	
	private String courseName;
	private Instructor instructor;
	private Textbook textbook;
	
	public Course(String courseName, Instructor instructor, Textbook textbook) {
		
		this.courseName = courseName;
		this.instructor = instructor;
		this.textbook = textbook;
	}
	
	public void printInfo() {
		
		System.out.println("Course name: " + courseName);
		System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName());
		System.out.println("Office number: " + instructor.getOfficeNum());
		System.out.println("Textbook: " + textbook.getTitle() + " by " + textbook.getAuthor());
		
		System.out.println();
	}
	
}
