import java.io.File;
import java.util.ArrayList;

public class SearchMgr {
	public void startSearch(ArrayList<String> listOfDrives, String fileName) {
        FileSearcher fileSearcher = new FileSearcher();
        for(String directoryPath : listOfDrives){
            File folder = new File(directoryPath);
            fileSearcher.searchForFolder(folder,fileName);
        }
    }
	
}
