package filetest;
import java.io.*;
import java.util.*;

public class RecentFile {
	
	public String getLatestFilefromDir(){
		
		File fil = new File("C:\\Users\\srujan\\Documents\\test");

		System.out.println(fil.lastModified());
		File [] files = fil.listFiles(new FilenameFilter() {
		    @Override
		    public boolean accept(File dir, String name) {
		        return name.startsWith("ss");
		    }
		});
	    
		if (files == null || files.length == 0) {
	        return null;
	    }

	    File lastModifiedFile = files[0];
	    for (int i = 1; i < files.length; i++) {
	       if (lastModifiedFile.lastModified() < files[i].lastModified()) {
	           lastModifiedFile = files[i];
	       }
	    }
	    System.out.println(lastModifiedFile.toString());
	    return lastModifiedFile.toString();
		
		}
		
	
	public static void main(String[] args)	{
		RecentFile tt = new RecentFile();
		
		tt.getLatestFilefromDir();
		
}
}
