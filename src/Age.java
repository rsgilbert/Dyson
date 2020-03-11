/**
 * 11th March 2020
 * By Dyson, under supervision by GilbertS
 * Calculating age from a given a birth year
 */

import java.util.Scanner;


public class Age {
    // This value is a constant (final) meaning it will not be changed
    // The variable is in allCaps to emphasized that it is a constant
    // The variable is static so as it can be accessed from the static main function
    final static int CURRENT_YEAR = 2020;


    public static void main(String[] args) {
        System.out.println("Enter the year of birth:");
        Scanner scan = new Scanner(System.in);
        int yearOfBirth = scan.nextInt();
        int age = CURRENT_YEAR - yearOfBirth;
        System.out.println(age);

    }
}
