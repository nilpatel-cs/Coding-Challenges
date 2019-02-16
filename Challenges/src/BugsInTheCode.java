import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nil
 *A version of 99 bottles of beer
 */
public class BugsInTheCode {
    public static void main(String[] args){
    Random badLuck = new Random();
    for(int i=99;i>0;){
        System.out.println(i + " Bugs in the Code!");
        System.out.println(i + " Bugs in the Code!");
        System.out.println(" You take one down and patch it around");
        if(20>badLuck.nextInt(100)) // A random chance of introducing more bugs during the fix
            i=i+2;
        else 
            i--;
        System.out.println(i + " Bugs in the Code");
}
}}
