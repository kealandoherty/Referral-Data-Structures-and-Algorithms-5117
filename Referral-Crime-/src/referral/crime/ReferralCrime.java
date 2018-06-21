package referral.crime;

 import java.io.*;
 import java.util.Scanner;


public class ReferralCrime {
    static Scanner S = new Scanner(System.in);
   
    public static void main(String[] args) throws IOException{
            
            ScanData.scanAllData();
            
            
            int choice = 0 ; 
            while (choice !=7) {
        
        
         System.out.println("--   Menu   --");
            System.out.println(" ");
            System.out.println("1 - Crime Types ");
            System.out.println("2 - Details of the crimes ");
            System.out.println("3 - Crimes - Under Investigation ");
            System.out.println("4 - Crimes - Investigation Complete ");
            System.out.println("5 - Highest Average total crime frequency ");
            System.out.println("6 - Highest Average unresolved crime frequency ");
            System.out.println("7 - Highest Crime frequency for a user-specified crime type ");
            System.out.println(" ");
            System.out.println("Select Number : ");
           choice = S.nextInt();
            
            }
            
            
            
            
            
            S.close();
            
            //crime types 
           
            //dkisplay all crimes across all LSOAs
            
            // determine how many crimes are under investigation and investigation complete "NS"
            
            // LSOA with the highest average total crime frequency 
            
            // LSOA with the highest average unresolved crimed frequency 
            
            // LSOA with the highesst crime frequency for a user-specified crime type 
            
            
            
            
                }  

   
        }
    

