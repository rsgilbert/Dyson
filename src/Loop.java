/**
 * 11th March 2020
 * By Dyson, under supervision by GilbertS
 * For Loop exercise.
 * Loop through all integers from 50 to 100 inclusive
 * and print all multiples of 10 between 50 and 100 inclusive
 */

public class Loop {
    public static void main(String[] args) {
        for (int num = 50; num <= 100; num++) {
            // We use % to check divisibility of num by 10
            // % is referred to as the modulo operator
            // num % 10 returns the remainder when you divide num by 10
            // If num % 10 equals to 0 then num is divisible by 10
            if (num % 10 == 0) {
                System.out.println(num);
            }
        }
    }
}
