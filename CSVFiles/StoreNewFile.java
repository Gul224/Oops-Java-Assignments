package CSVFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StoreNewFile {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/gul/Downloads/file.txt");
        Scanner scan = new Scanner(file);

        String fileContent = "This is a new file made by me ";
        while (scan.hasNext()){
            fileContent = fileContent.concat(scan.nextLine() + "");

        }
        FileWriter writer = new FileWriter("/home/gul/Desktop/newfile.txt");
        writer.write(fileContent);
        writer.close();
    }
}
