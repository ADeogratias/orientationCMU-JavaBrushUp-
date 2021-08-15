import java.util.*;
/**
 *
 * @author Deogratias Amani
 * On my honor, as a Carnegie-Mellon Africa student,
 * I have neither given nor received unauthorized assistance on this work.
 *
 */

/**
 * I want to search files in my system.There can be many ways to search for a file.
 * I can search by entering a file name,by entering
 * both the file name and the location/path of the file,
 * by file extension and the location of the file or
 * by searching for a file matching a specific pattern in a give file location.
 * Create that class with constructors matching the mentioned signatures.
 * Note: Methods should just print a text explaining what the method does.
 * No need to implement search functionalities
 */


public class SearchFile
{
    String fileName;
    String filePath;
    String fileExtension;

    public SearchFile(String fileName)
    {
        this.fileName = fileName;
        System.out.println("Constructor is to help search by name of the file only");
    }

    public SearchFile(String fileName, String filePath)
    {
        this.fileName = fileName;
        this.filePath = filePath;
        System.out.println("Constructor is to help search by name and path of the file ");
    }

    // there is a clash from what the question is asking so I added an extra argument.
    public SearchFile(String fileExtension, String filePath, String fileName)
    {
        this.fileExtension = fileExtension;
        this.filePath = filePath;
        this.fileName = fileName;
        System.out.println("Constructor is to help search by file extension and path of the file ");
    }

}
