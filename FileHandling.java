import java.io.FileWriter;
import java.io.IOException;
class FileHandling
{
    public static void main(String[] args) throws IOException
    {
        // Accept a string
        String str = "File Handling in Java using "+
                     " FileWriter and FileReader";
 
        // attach a file to FileWriter
        FileWriter fw=new FileWriter("text");
 
        // read character wise from string and write
        // into FileWriter
        for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i));
 
        //close the file
        fw.close();
    }
}