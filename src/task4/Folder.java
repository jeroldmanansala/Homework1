package task4;

import java.util.Map;
import java.util.HashMap;

public class Folder {
	
	private String name;
	
	//create map to store 
	
	private Map<String, File> files;
	private Map<String, Folder> folders;
	
	public Folder(String name) {
		this.name = name;
		this.files = new HashMap<>();
		this.folders = new HashMap<>();
	}
	
	//getters and setters
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addFile(File file) {
		files.put(file.getName(), file);
	}
	
	public void addFolder(Folder folder) {
		folders.put(folder.getName(), folder);
	}
	
	public void print() {
		
		System.out.println("Folder name: " + name);
		System.out.println("Files: ");
		
		for (int i=0;i<files.size();i++) {
			
			File file = files.get(files.keySet().toArray()[i]);
			file.printFile();
			
		}
		
		System.out.println("Subfolders: ");
		
		for (int i=0;i<folders.size();i++) {
			Folder folder = folders.get(folders.keySet().toArray()[i]);
			folder.print();
			
			System.out.println();
		}
		
		
	}
	
	
}
