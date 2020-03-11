/**
 * 11th March 2020
 * By Dyson, under supervision by GilbertS
 * Introduction to the if statement
 */

import java.util.Scanner;

public class Underage {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        // if age is less than 18, then
        // the person is underage
        if (age < 18) {
            System.out.println("You are underage");
        } else {
            System.out.println("You are mature");
        }
    }
}
