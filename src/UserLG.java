/**
 * 27th Feb 2020
 * By Dyson, under supervision by GilbertS
 * In this file Dyson learns how to use the Scanner class to
 * request multiple inputs from the command line one at a time
 * She uses the inputs to calculate and print their total
 *
 */

// We import the Scanner class from the util library
import java.util.Scanner;

// Create a class called UserLG
public class UserLG {
    public static void main(String args[]){
        // We test to see if everything is fine by running a simple print command
        System.out.println("hello Dyson");

        // We create a new Scanner object.
        // This object will accept inputs from the keyboard
        Scanner myScanner = new Scanner(System.in);

        // we call nextInt on our scanner object which returns an integer
        // we store the integer in an integer variable (eg num1, num2 ... )
        int num1 = myScanner.nextInt();
        int num2 = myScanner.nextInt();
        int num3 = myScanner.nextInt();
        int num4 = myScanner.nextInt();
        int num5 = myScanner.nextInt();

        // We compute the total using addition arithmetic
        int total = num1 + num2 + num3 + num4 + num5;

        // Finally, we print the total
        System.out.println("the total is " + total);
    }
}
