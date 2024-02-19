package task3;

public class Main {

	public static void main(String[] args) {
		
		//initiate
		Textbook textbook = new Textbook("Clean Code: A Handbook of Agile Software Craftmanship", "Robert C. Martin", "Prentice Hall");
		Instructor instructor = new Instructor("Nima", "Davarpanah", "3-263");
		Course course = new Course("CS 4800: Software Engineering", instructor, textbook);
		
		Textbook textbook2 = new Textbook("GPU Computing", "William Snider", "Sony");
		Instructor instructor2 = new Instructor("James", "Cruz", "4-123");
		Course course2 = new Course("CS 4990: GPU", instructor2, textbook2);
		
		course.printInfo();
		course2.printInfo();
	}

}
