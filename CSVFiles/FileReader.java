package CSVFiles;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String []  args) throws FileNotFoundException {
        File file = new File("/home/gul/Downloads/file.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNext()){
            System.out.println(scan.nextLine());
        }


        }
    }

