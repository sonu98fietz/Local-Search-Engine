import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchConsoleClient {
	public static  String Drivename ;
	public static  String fileName ;
	public static void main(String[] args)  throws IOException {

		SearchControl drivehave = new SearchControl();
		drivehave.drivehave();
		String DriveNames = drivehave.getdrive();
        File folder = new File(DriveNames);
//        fileName = "NPTEL C PAYMENT";
        fileName = "detect_mask_picam";
        FileSearcher fileSearcher = new FileSearcher();
        fileSearcher.searchForFolder(folder, fileName);
        SearchHistoryMgr SHmgr = new SearchHistoryMgr(); 
        SHmgr.history();
        ArrayList<String> result = SearchResult.getFileFoundPaths();
        for(String arr:result) {
        	System.out.println(arr);
        }
	
	}
	public String getfileName() {
		return fileName;
	}
}
