import java.util.ArrayList;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nil
 * The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... 
 * The next number is found by adding up the two numbers before it.
 * User enters a number the value at that place is generated
 */
public class FibonacciSequence {
    public static void main(String [] args){
        int i ,j ,k, h, n;
        ArrayList<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);
        System.out.println("Enter which place in the sequence you want:");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (i=2;i<n;i++){ //generates and arraylist for the sequence
        j=fib.get(i-2);
        k = fib.get(i-1);
        fib.add(j+k);
        }
        System.out.println(fib.get(n-1));//n-1 because 0 -> n-1
        System.out.println(fib); // prints the array that was built
        
        j = 0;
        k = 1;
        
        for(i=2;i<n;i++){ // will only generate the desired number without building an arraylist
        h = k; //temporary storage
        k = j + k; // adds the last two to get current
        j = h;//changes to value that is no longer current        
        }
        System.out.println(k);
    }
}
