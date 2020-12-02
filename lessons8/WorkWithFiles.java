package Lesson8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithFiles {
    public static void main(String[] args) {

        String text = "Hello File World!";
        String fileName = "c:\\Java\\newfile.txt";

        File file = new File(fileName);
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
