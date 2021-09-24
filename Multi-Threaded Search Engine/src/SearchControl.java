import java.io.File;
import java.util.Scanner;

public class SearchControl {
	public static String Drivename;
	String DriveNames;
	
	public void drivehave() {
		File[] drives = File.listRoots();
		if (drives != null && drives.length > 0) {
		    for (File aDrive : drives) {
		        System.out.println(aDrive);
		    }
		}
		
		System.out.println("Enter drive letter to search in : ");
		Scanner sc= new Scanner(System.in);
		DriveNames =sc.nextLine();
		if(DriveNames.equals("C")) {
		   Drivename="C:\\Users\\sonuk\\OneDrive";                           
		}else if(DriveNames.equals("E")) {
		   Drivename="E:\\";
		}else if(DriveNames.equals("F")) {
		   Drivename="F:\\";
		}
		}
		public String getdrive() {
			return Drivename;
		}
	
}
