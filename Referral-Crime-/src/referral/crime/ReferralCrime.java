package referral.crime;

import classes.Crime;
import classes.Location;
import java.io.*;
import java.util.Scanner;
import referral.crime.ScanCSV;

public class ReferralCrime {
    public static void main(String[] args) throws IOException{
            ScanCSV.readData();
            // Menu so the user can navigate through the program 
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
                       		
                                }
		break;
			
		case 3 : 
                        {
                        ScanCSV.printCrimeStatus(); // prints out the method that shows the user the different crime status'
                }
                        break;
                case 4 : 
                        {
                       ScanCSV.printHighestCrimeFreq(); //prints out the highest crime frequency lsoa code and number of times crime happens
                       
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
