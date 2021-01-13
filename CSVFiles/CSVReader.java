package CSVFiles;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CSVReader {
    public static void main(String []  args){

        // Splitting each line
        String path = "/home/gul/Downloads/Sample-Spreadsheet-10-rows.csv";
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

          while ((line = br.readLine())  != null){
              // we are using split method to seperate words with commas
              String[] values = line.split(",");
           System.out.println(values[1]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
