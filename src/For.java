/**
 * 11th March 2020
 * By Dyson, under supervision by GilbertS
 * Introduction to the for loop
 */

public class For {
    public static void main(String[] args) {
        // We loop from 0 to 10.
        // We add 3 to i every time we loop
        // Consequently, we loop 4 times, ie. 0, 3, 6, 9
        for (int i = 0; i < 10; i += 3) {
            System.out.println(i);
        }
    }
}
