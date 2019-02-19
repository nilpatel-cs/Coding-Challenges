
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nil
 * Populate an array of numbers from 1 to N (inclusive).
 * Given two numbers, p and q , if a number in the array is divisible by p print OUT, if a number is divisible by q print THINK.
 * If number is divisible by both p and q, print OUTTHINK. Otherwise, print the number.  
 */
public class OutClass {
      public static void main (String [] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Pick a integer n:");
    int n = keyboard.nextInt(); // takes users input for n will not continue untill input recieved
       int[] intArray = new int[n]; // will make an array of n spots
    for(int i = 1;i<=n;i++){ //loops up to n
      intArray[i-1]=i;  //array stores from 0 to n-1
        }
    System.out.println("Enter a integer p:");
    int p = keyboard.nextInt(); //user input for p
    System.out.println("Enter a integer q:");
    int q = keyboard.nextInt(); // user input for q
    for(int i =0;i<n;i++) //loops from 0 to n-1
    {
    if(intArray[i]%p == 0 && intArray[i]%q == 0){ //checks if condition for OUTHINK are met
       System.out.print("OUTHINK, ");
    }
    else if(intArray[i]%p == 0){ // if value fails first condition will now check is condition for OUT is met
        System.out.print("OUT, ");
    }
    else if (intArray[i]%q == 0){ //checks if condition for THINK is met
        System.out.print("THINK, ");
    }
    else{ //will print the number if fails all other conditions
    System.out.print(intArray[i]+", ");
    } 
    }
    }
}