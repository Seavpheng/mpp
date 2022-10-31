package lab_10.prob_2;

import java.io.*;
import java.util.logging.Logger;

public class NewFileIO {
    private static final Logger LOG = Logger.getLogger(OldFileIO.class.getName());
    public final static String FILE_LOCATION = "src/lab_10/prob_3/output.txt";
    public final static String TO_PRINT = "This is the string to print to file.";

    void writeText(String filename, String text)  {
        try(PrintWriter pw = new PrintWriter(new FileWriter( new File( filename)))) {
            pw.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        NewFileIO newFile = new NewFileIO();
        newFile.writeText(FILE_LOCATION, TO_PRINT);

    }
}
