/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nil
 * The FizzBuzz rules are numbers 1 to 100, multiples of 3 print Fizz, multiples by 5 are Buzz, multiples of both are FizzBuzz
 */
public class FizzBuzz {
   public static void main(String[] args){
   
   for(int i =1;i<=100;i++){
       if (i%3 == 0 && i%5 == 0) //made the first condition an "and" logic to eliminate multiples of three and five first added next line to improve clarity
           System.out.println("FizzBuzz, ");
       else if (i%3 == 0)
           System.out.println("Fizz, ");
       else if (i == 100)
           System.out.println("Buzz.");
       else if (i%5 == 0)
           System.out.println("Buzz, ");
       else
           System.out.print(i +", ");
   }
   } 
}
