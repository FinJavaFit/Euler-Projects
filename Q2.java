
package mooo;

import java.util.Arrays;
import java.util.Scanner;

public class MOOO {

    public static void main(String[] args) {
  
        Scanner reader = new Scanner(System.in);
       
        int sum = 0;
        int sum1 = 0;
       
      
        
        for (int i = 1; i < 4000000; i+=sum ) {//scanner could replace "4,000,000" in for loop for user input
            sum += i;
         
            
          if ((i % 2) == 0) { //checks if int is even
                
                sum1 = sum1 + i;
               
            }
            
          else if ((sum % 2)== 0) {//checks if int is even
                sum1 = sum1 + sum;    
            }
           
             System.out.println(i + " " + sum);//prints out each number (for the sake of making sure pattern is correct)
            }
             
            
     System.out.println("Final sum1 = " + sum1);//prints sum1 after loop is completed
    }
    
}
