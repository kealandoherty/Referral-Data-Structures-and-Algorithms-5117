package referral.crime;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;


public class ScanCSV {
    
    
    static ArrayList < HashMap < String, String >> CrimeData = new ArrayList < HashMap < String, String >> ();

    public static void fileScanner(FileInputStream file, String CrimeID) {

        Scanner fileScanner = new Scanner(file);
        String crime = fileScanner.nextLine();
      
    
     while (fileScanner.hasNextLine()) {
            HashMap < String, String > buffer = new HashMap < String, String > ();
            
            ArrayList < String > lineData = new ArrayList < String > ();
                    
            String put = buffer.put("crimeID", CrimeID);
            buffer.put("Month", lineData.get(0));
            buffer.put("ReportedBy", lineData.get(1));
            buffer.put("FallsWithin", cleanData(lineData.get(2)));
            buffer.put("Longitude", cleanData(lineData.get(3)));
            buffer.put("Latitude", cleanData(lineData.get(4)));
            buffer.put("Location", cleanData(lineData.get(5)));
            buffer.put("LSOA code", cleanData(lineData.get(6)));
            buffer.put("LSOA name", cleanData(lineData.get(7)));
            buffer.put("Crime Type", cleanData(lineData.get(8)));
            buffer.put("Last outcome", cleanData(lineData.get(9)));
            buffer.put("Contect", cleanData(lineData.get(10)));
            
           

            CrimeData.add(buffer);
            
        }
        fileScanner.close();
    }

    public static void scanAllData() throws FileNotFoundException {
        fileScanner(new FileInputStream("Data\\2018-02-merseyside-street.csv"));
        fileScanner(new FileInputStream("Data\\2018-03-merseyside-street.csv"));
        fileScanner(new FileInputStream("Data\\2018-04-merseyside-street.csv"));
       
    }

    private static String cleanData(String get) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void fileScanner(FileInputStream fileInputStream) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
    
    
}