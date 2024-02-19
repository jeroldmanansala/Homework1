package task4;

public class Main {

	public static void main(String[] args) {
		
		 // file structure
        Folder phpDemo1 = new Folder("php_demo1");
        
        Folder sourceFiles = new Folder("Source Files");
        Folder includePath = new Folder("Include Path");
        phpDemo1.addFolder(sourceFiles);
        phpDemo1.addFolder(includePath);
        
        Folder remoteFiles = new Folder("Remote Files");
        phpDemo1.addFolder(remoteFiles);
        
        Folder folderPhalcon = new Folder(".phalcon");
        //Folder folderApp = new Folder("app");
        Folder folderCache = new Folder("cache");
        //Folder folderPublic = new Folder("public");
        sourceFiles.addFolder(folderPhalcon);
        //sourceFiles.addFolder(folderApp);
        sourceFiles.addFolder(folderCache);
        //sourceFiles.addFolder(folderPublic);
        
        //folderApp.addFolder(new Folder("config"));
        //folderApp.addFolder(new Folder("controllers"));
        //folderApp.addFolder(new Folder("library"));
        //folderApp.addFolder(new Folder("migrations"));
        //folderApp.addFolder(new Folder("models"));
        //folderApp.addFolder(new Folder("views"));
        
        //folderPublic.addFile(new File(".htaccess"));
        //folderPublic.addFile(new File(".htrouter.php"));
        //folderPublic.addFile(new File("index.html"));
        
        phpDemo1.print();
	}

}
