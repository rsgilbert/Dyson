/**
 * 11th March 2020
 * By Dyson, under supervision by GilbertS
 * Exercise on String concatenation.
 * Printing the name and age
 */

import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = scan.next();
        System.out.println("Enter the age:");
        int age = scan.nextInt();
        String message = name + " is " + age + " years old";
        System.out.println(message);

    }
}
