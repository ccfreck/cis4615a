import java.util.*;

public class R02_XP00_J
{
    public static void main(String [] args)
    {
        // deleteFile();
    }
    public void deleteFile()
    {
        File someFile = new File("someFileName.txt");
        // Do something with someFile
        if (!someFile.delete())
        {
            // Handle failure to delete the file
            // System.out.println("Failure to delete file.");
        }
    }
}