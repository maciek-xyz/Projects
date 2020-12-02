package Lesson8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WorkWithFilesRead {
    public static void main(String[] args) {
        String fileName = "c:\\Java\\newfile.txt";
        File file = new File(fileName);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Unable to read file");
        }
    }
}
