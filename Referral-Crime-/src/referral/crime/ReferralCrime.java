package referral.crime;

import classes.Crime;
import classes.Location;
 import java.io.*;
 import java.util.Scanner;
 import referral.crime.ScanCSV;


public class ReferralCrime {
    public static void main(String[] args) throws IOException{
            ScanCSV.readData();
            
         System.out.println("--   Menu   --");
            System.out.println(" ");
            System.out.println("1 - Crime Types ");
            System.out.println("2 - Details of the crimes ");
            System.out.println("3 - Crimes - Under Investigation Or Investigation Complete ");
            System.out.println("4 - Highest Average total crime frequency ");
            System.out.println("5 - Highest Average unresolved crime frequency ");
            System.out.println("6 - Highest Crime frequency for a user-specified crime type ");
            System.out.println(" ");
            System.out.println("Select Number : ");
             Scanner S = new Scanner(System.in);
             int choice = S.nextInt();
           
               switch (choice) {
                case 1:
                    {
                      ScanCSV.printAllCrimeTypes();
                                }
                break;
			
		case 2 : 
                        {
			//CrimeDetails();		
                                }
		break;
			
		case 3 : 
                        {
			//CrimeStatus();		
                        }
                break;
                
                case 4 : 
                        {
                       // CrimeFreq();
			}
                break;
              
                case 5 : 
                        {
			//UnresolvedCrime();	
                        }
            break;
                case 6:   {
                       // CrimeFreqUserSpecified();
			}
                break;
            
              }
            
              S.close();
            
    }
    //crime types 
          private static void CrimeType()
          {
              ScanCSV.locationList.forEach((location) -> {
                  location.getCrimeList().forEach((crime) -> {
                      System.out.println(crime.getCrimeType());
                  });
        });      
        
} 
              
             
        //dkisplay all crimes across all LSOAs     
          private static void CrimeDetails()
                  {
                   System.out.println("Here are the details of all crimes across all LSOAS");
                      
                     // String Details
                      
                  }
          // determine how many crimes are under investigation and investigation complete "NS"
           private static void CrimeStatus()
                  {
                  System.out.println("Are you looking for crimes that are underinvestigation or are complete? ");
                  
//                  Scanner S3 = new Scanner(System.in);
//                  String CStat = S3.nextLine();
                  
                  
                  }
          // LSOA with the highest average total crime frequency 
           private static void CrimeFreq()
           {
               System.out.println("LSOA with the highest average total crime frequency is:"      );
               
               
           }
           // LSOA with the highest average unresolved crimed frequency 
           private static void UnresolvedCrime()
           {
                System.out.println("LSOA with the highest average unresolved crime frequency is:"      );
               
               
           }
            // LSOA with the highesst crime frequency for a user-specified crime type 
           private static void CrimeFreqUserSpecified()
           {
                System.out.println("LSOA with the highest crime rate for the crime type specified is: ");
           }       

}  
    