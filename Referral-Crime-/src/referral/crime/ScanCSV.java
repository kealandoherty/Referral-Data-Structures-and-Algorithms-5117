package referral.crime;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.*;

public class ScanCSV {
    
    public static void main(String[] args) throws FileNotFoundException{
      String fileName =  "Data\\2018-02-merseyside-street.csv";
      File file = new File(fileName);
      
          Scanner inputStream = new Scanner(file);
            while (inputStream.hasNext()){
            String data =  inputStream.next();
            String[] values = data.split(",");
            System.out.println(data);
        
     
      }
      
 inputStream.close();
}
  
//    public static void main(String[] args)throws FileNotFoundException{
//        Scanner scan = new Scanner(new File("Data\\2018-02-merseyside-street.csv")) {
//            scan.useDelimiter(",");
//            while (scan.hasNext()){
//                System.out.print(scan.next()+"|");
//            }
//            scan.close();
//        }
//                
//    }
    
    
//            fileScanner(new FileInputStream("Data\\2018-02-merseyside-street.csv"));
//        fileScanner(new FileInputStream("Data\\2018-03-merseyside-street.csv"));
//        fileScanner(new FileInputStream("Data\\2018-04-merseyside-street.csv"));
//       

       
}