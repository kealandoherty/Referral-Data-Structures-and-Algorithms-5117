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
                      ScanCSV.printAllCrimeTypes(); // Variable that prints out A
                                }
                break;
			
		case 2 : 
                        {
                            //Prints out the different crime types that we have for them to choose out of 
                         ScanCSV.printAllCrimeDetails();
                       
                          
			//CrimeDetails();		
                                }
		break;
			
		case 3 : 
                        {
                        ScanCSV.printCrimeStatus();
                }
                        break;
                case 4 : 
                        {
                       ScanCSV.printHighestCrimeFreq();
                       
			}
                break;
              
                case 5 : 
                        {
			ScanCSV.printHighestUnresolvedCrimeFreq();
                        }
            break;
                case 6:   {
                       ScanCSV.printCrimeFreqUS();
			}
                break;
            
              }
            
              S.close();
            
               }
    }
