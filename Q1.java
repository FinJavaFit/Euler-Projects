
package booleans1;

import java.util.Arrays;
import java.util.Scanner;

public class Booleans1 {


    public static void main(String[] args) {
        //Project Euler Q1
        

        Scanner scan = new Scanner(System.in);
        
        System.out.println("\n");
        System.out.println("Enter your number: ");
        
        int number = scan.nextInt();
       
        int [] eul = new int [number];//The program creates an array based on user input
        int sum = 0;
       
        for (int i = 0; i < number; i++) {
            
            if ((i % 3)==0 || (i % 5)==0) {//The program then adds natural numbers that are only multiples of 3 or 5 for given number 
                
                eul[i] = i;//the program could be done without the array. The array is created for the purpose of taking it a step further later on(if an idea came about).
                sum += i;//program sums the numbers in the created array
               
            }
 
        }
         System.out.println(sum);//Only prints sum once loop is completed
        System.out.println(Arrays.toString(eul)); //Prints out the array as string.
  
    }
    
}
