import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.*;

public class SearchHistoryMgr  {

	public void history() throws IOException {
	try {
		File file = new File("C:\\Users\\sonuk\\OneDrive\\Desktop\\zensar\\JAVA\\1 to11\\SearchResult.txt");
		FileWriter searchhis = new FileWriter(file,true);
		PrintWriter pw = new PrintWriter(searchhis);
		for(Map.Entry<String, String> entry : SearchResult.fileFoundPaths.entrySet()) {
			pw.println(entry.getKey() + "  =  "+entry.getValue());		
		}
		searchhis.flush();
		searchhis.close();
		Scanner scan  = new Scanner(file);
		System.out.println(scan.nextLine());
		while (scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
		
	}catch(FileNotFoundException fx) {
		System.out.println(fx);
	}
	}
}
