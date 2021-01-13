package CSVFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVFileData {
    public static void main(String[]  args){

        String path = "/home/gul/Downloads/1000-Sales-Records/1000 Sales Records.csv";
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while ((line =br.readLine()) != null ){
    System.out.println(line);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
