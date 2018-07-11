package referral.crime;

import java.util.*;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Calcs {
    DecimalFormat DF = new DecimalFormat(", ");
    static ArrayList < HashMap < String, String >> newData = new ArrayList < HashMap < String, String >> ();
 
    public static void getCrimeType(String value1) {
        for (HashMap hm: ScanCSV.CrimeData) {
            if ((hm.get("Crime Type").equals(value1))) {
                
                newData.add(hm);
            
            
            }
            
        }
         newData.forEach(System.out::println);
     
    }
    
    
    public static void crimedetails (String key2, String value2) {
        
    }
    
    
    
}
    
    
    
    
    
    

   
    
//Crime ID
//Month
//reported by
//Longitude
//latitude 
//location
//LSOA Code
//LSOA Name
//Crime Type
//Last outcome
//Context