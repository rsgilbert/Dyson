/**
 * 11th March 2020
 * By Dyson, under supervision by GilbertS
 * Introduction to Strings
 */

public class MyString {
    public static void main(String[] args) {
        // Creating a string
        String name = "Dyson";

        // Finding the number of characters in a String
        int count = name.length();
        System.out.println(count);

        String bigD = name.toUpperCase();
        System.out.println(bigD);

        // String concatenation
        String fName = "Dyson";
        String lName = "Asingwire";
        String fullName = fName + " " + lName;
        System.out.println(fullName);


    }
}
