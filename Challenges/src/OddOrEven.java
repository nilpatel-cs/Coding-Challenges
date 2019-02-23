import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nil
 * Simple program that will check if a number is odd or even
 */
public class OddOrEven {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a integer:");
    int num = input.nextInt();
    if (num%2 == 0){ //pretty straightforward if you have a remainder after dividing by two the number is not even
    System.out.println("Number is even.");
    }
    else{
    System.out.println("Number is odd.");
    }
    
    }
    
}