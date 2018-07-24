package referral.crime;
//import java.util.Scanner;
//import java.io.FileNotFoundException;
//import java.io.*;

//public class ScanCSV {
//    
//    public static void main(String[] args) throws FileNotFoundException{
//      File dir = new File("C:\\Users\\Kealans Laptop\\Documents\\GitHub\\Referral-Data-Structures-and-Algorithms\\Referral-Crime-\\Data");
//        for (File file : dir.listFiles()){
//      
//          Scanner inputStream = new Scanner(file);
//            while (inputStream.hasNext()){
//             String data =  inputStream.next();
//             String[] values = data.split(",");
//                System.out.println(data);
//        
//     
//                 }
//      
//                inputStream.close();
//            }
     
//
//    }     
//}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import classes.Crime;
import classes.Location;


public class ScanCSV{

	static ArrayList<Location> locationList = new ArrayList<Location>();
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
               readData();
              
               //printAllCrimeTypes();       
               
        }

        public static void printAllCrimeTypes(){
            ArrayList<String> crimeTypes = new ArrayList<String>();
            
            for (Location location : locationList) {
               	for (Crime crime : location.getCrimeList()) {

				boolean isCrimeTypeNew = true;

				// Check if crimeType is already in the list
				for (String crimeType : crimeTypes) {
					if (crime.getCrimeType().equalsIgnoreCase(crimeType)) {
						isCrimeTypeNew = false;
					}
				}

				if (isCrimeTypeNew) {
					System.out.println(crime.getCrimeType());
					crimeTypes.add(crime.getCrimeType());
				}

			}
		}            
        }  
        
        
        
	public static void readData() throws FileNotFoundException{
            final String URL = "Data/";
            
		File folder = new File(URL);
		File[] listOfFiles = folder.listFiles();
		
		for (int i = 0; i < listOfFiles.length; i++) {
			
			FileReader fileReader = new FileReader(URL + listOfFiles[i].getName());
			Scanner fileScanner = new Scanner(fileReader);
			
			Location newLocation = new Location();
			
			//Ignore the line detailing what the data is
			String line = fileScanner.nextLine();
			
			String name = listOfFiles[i].getName();
			
			newLocation.setLocationName(name);
                        if (name.toLowerCase().indexOf("street") != -1){
                                locationList.add(newLocation);
                            
			
			
			while(fileScanner.hasNext()){
				line = fileScanner.nextLine();
				
				Crime crime = new Crime(line);
				newLocation.getCrimeList().add(crime);
                         }
			}
			
		}
		
	}
	
}