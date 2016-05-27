
package mooo;

import java.util.Arrays;
import java.util.Scanner;

public class MOOO {

    public static void main(String[] args) {
  
        Scanner reader = new Scanner(System.in);
       
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
      
        
        for (int i = 1; i < 4000000; i+=sum ) {
            sum += i;
         
            
          if ((i % 2) == 0) {
                
                sum1 = sum1 + i;
               
            }
            
          else if ((sum % 2)== 0) {
                sum1 = sum1 + sum;    
            }
           
             System.out.println(i + " " + sum);
            }
             
            
     System.out.println("Final sum1 = " + sum1);
    }
    
}
