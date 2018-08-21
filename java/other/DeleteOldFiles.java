import java.io.File;
import java.util.*;

class DeleteOldFiles {
    public static void main(String[] args){

        long numDays = 8;                                                    //this needs to be a long.        
        String dir = "/path/";                                               //WARNING!  old files in this directory will be deleted.
        File directory = new File(dir);
        File[] fList = directory.listFiles();

        if (fList != null){
            for (File file : fList){
                if (file.isFile() && file.getName().contains("test_")){      // lets assume file name starts with test_

                    long diff = new Date().getTime() - file.lastModified();
                    long cutoff = (numDays * (24 * 60 * 60 * 1000));

                    if (diff > cutoff) {
                      file.delete();
                    }
                }
            }
        }
    }
}
