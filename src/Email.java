/**
 * 11th March 2020
 * By Dyson, under supervision by GilbertS
 * Authenticating a user based on email and password
 */

import java.util.Scanner;

public class Email {
    // This value is a constant (final) meaning it will not be changed
    // The variable is in allCaps to emphasized that it is a constant
    // The variable is static so as it can be accessed from the static main function
    final static String CORRECT_PASSWORD = "dysonsing@gmail.com";
    final static String CORRECT_EMAIL = "nimusiima";

    public static void main(String[] args) {
        System.out.println("Enter your email:");
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        System.out.println("Enter your password:");
        String password = scan.next();

        if (email.equals(CORRECT_EMAIL)) {
            if (password.equals(CORRECT_PASSWORD)) {
                System.out.println("Success");
            } else {
                System.out.println("Wrong password");
            }
        } else {
            System.out.println("Wrong email");
        }
    }
}
