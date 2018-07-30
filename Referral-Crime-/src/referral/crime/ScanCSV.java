package referral.crime;

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
        }

        public static void printAllCrimeTypes(){ //a
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
        
        public static void printAllCrimeDetails(){
            //Have to figure out what kind of crime the user is looking for 
              boolean found = false;
                     while(!found){
                         
             printAllCrimeTypes();
             System.out.println("Please enter a crime type: ");
             Scanner input = new Scanner(System.in);
             String inputType = input.nextLine();

              for (Location location : locationList){    
                 for (Crime crime : location.getCrimeList()) {
					if (crime.getCrimeType().equalsIgnoreCase(inputType)) {
                                           found = true;
                                          System.out.println(crime);  
					
                                                               }
                                           }     
				}
              }              
        }
                       
        public static void printCrimeStatus() {
             boolean found = false;
                     while(!found){                
            
             System.out.println("Please enter an option, Under Investigation or Investigation Complete: ");
             Scanner input = new Scanner(System.in);
             String inputType = input.nextLine();

              for (Location location : locationList){    
                 for (Crime crime : location.getCrimeList()) {
					if (crime.getLastOutcome().equalsIgnoreCase(inputType)) {
                                           found = true;
                                           
                                          System.out.println(crime);  
                                          int total;
                                            total = input.totalOf(inputType);
                                          int count = 0;
                                            while (total != -1){
                                                count++;
                                                input = input.totalOf(inputType, total + 1);
                                                
                                            }
                                          System.out.println("This is the amount of crimes still"+ inputType + ": " + count);
                                            
                                                               }
                                           }
                                    }
                                }              
        }
                   
        public static void printHighestCrimeFreq() {
            
        }
//        D. Find the LSOA with the highest average total crime frequency
        public static void printHighestUnresolvedCrimeFreq() {
            
        }
//        E. Find the LSOA with the highest average unresolved crime frequency (i.e. outcome ii for C)
        public static void printCrimeFreqUS(){
            
        }
//        F. Find the LSOA with the highest crime frequency for a user-specified crime type
        
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