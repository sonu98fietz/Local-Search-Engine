import java.io.File;
import java.util.*;


public class FileSearcher extends Thread {
	String filePath ;
	static SearchResult searchResult = new SearchResult();
	boolean isFileFound;

	public void searchForFolder(File folder, String fileToSearch) {
		File[] filesanddirectories = folder.listFiles();
		ArrayList<File> files = new ArrayList<>();
		for (File file : filesanddirectories) {
		
            if (file.isFile()) {
                files.add(file);
            }
        }
		for (File file : files) {
	            String currentFileName = file.getName().split("[.]")[0];
	        
	            if (fileToSearch.equalsIgnoreCase(currentFileName)) {
	            	filePath= file.getPath();
	            }
	       }
		if (filePath != null) {
            isFileFound = true;
            searchResult.addFileFoundPath(fileToSearch, filePath);
            System.out.println("File Found");
            System.out.println(filePath);
        }
		ArrayList<File> Directories = new ArrayList<>();
		for (File file : filesanddirectories) {

            if (file.isDirectory()) {
                Directories.add(file);
            }
        }
		if (!Directories.isEmpty()) {
            for (File directory : Directories) {
            	searchForFolder(directory, fileToSearch);
                if (isFileFound) {
                    break;
                }
            }
        }
	}
}
