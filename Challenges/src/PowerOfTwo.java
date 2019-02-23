import java.util.Scanner;


/**
 *
 * @author Nil
 * Find out if a number is a power of two
 */
public class PowerOfTwo {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = input.nextInt(); // 2^x = n is what we need to test which is essentially logbase2n = x, if x is a whole number that would mean that n is a power of two otherwise it is not.
    double m = Math.log(n)/Math.log(2); // logbase2n = log(n)/log(2)
    if(m%1 == 0){// checks to see if the log is whole number
    System.out.println(n + " is a power of 2, specifically 2^" + (int)m);}//casting m as int because it is a double and 2^3.0 for example does not look as clean as 2^3
    else{
      System.out.println(n + " is not a power of 2");       
            }
   
    }
}
