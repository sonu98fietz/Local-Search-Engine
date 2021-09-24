import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SearchResult {

	public static HashMap<String ,String> fileFoundPaths = new HashMap<>();
	
	public static ArrayList<String> getFileFoundPaths(){
		ArrayList<String> searchPathsList= new ArrayList<String>();
		for(Map.Entry<String, String> entry : fileFoundPaths.entrySet()) {
			searchPathsList.add(entry.getKey() + "  =  "+entry.getValue());		
		}
		return searchPathsList;
	}
	
	public void addFileFoundPath(String filename, String path) {
		fileFoundPaths.put(filename, path);
		
	}

	
	
}
