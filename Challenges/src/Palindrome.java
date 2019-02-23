import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nil
 * Take and number and check to see if it is a palindrome ex. 121 reversed is still 121 so it would pass the check 123 would fail.
 */
public class Palindrome {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an integer:");
    int n = input.nextInt();
    String s = Integer.toString(n);//the simplest way to reverse the number is to turn it to a string
    String g = "";
    for (int i = 0;i<s.length();i++){//reversing the string
        g = s.charAt(i) + g;
    }
    if (g.equals(s)){//checks to see if the reversed is the same as the original therefore confirming it is a palindrome
        System.out.println(n + " is a palindrome");}
    else{
        System.out.println(n + " is not a palindrome");}
    
    
}}
