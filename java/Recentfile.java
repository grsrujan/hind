// Get recently modified file

package filetest;
import java.io.*;

public class Test {
	
	public static void main(String[] args)	{
	File fil = new File("C:\\Users\\srujan\\Documents\\new");

	//System.out.println(fil.lastModified());
	
	File [] files = fil.listFiles(new FilenameFilter() {
	    @Override
	    public boolean accept(File dir, String name) {
	        return name.startsWith("test");
	    }
	});
    
	File lastModifiedFile = files[0];
	for (int i = 1; i < files.length; i++) {
	    if (lastModifiedFile.lastModified() < files[i].lastModified()) {
	           lastModifiedFile = files[i];
	       }
	    }
	    System.out.println(lastModifiedFile);
	}
}
