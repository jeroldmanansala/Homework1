package task4;

public class File {

	private String name;
	
	public File(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void printFile() {
		System.out.println("File: " + name);
	}
}
