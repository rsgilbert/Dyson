/**
 * 27th Feb 2020
 * By Dyson, under supervision by GilbertS
 * In this file Dyson builds on the knowledge she learnt about the
 * Scanner class in the UserLG file.
 * She uses her knowledge of the for-loop to write a program
 * that determines the maximum value given five inputs.
 *
 */

import java.util.Scanner;

public class Dyson {
    public static void main(String[] args){
        Scanner dyScanner = new Scanner(System.in);

        // We keep a record of the maximum value
        int max = 0;


        // We loop five times. That is 0, 1, 2, 3 and 4
        for (int i=0; i<5; i++){
            // scan for our input
            int input = dyScanner.nextInt();

            // if the loop is executing for the first time we
            // need to set the value of max to the first input.
            // This is important to cater for negative inputs
            // which are less than 0.
            if(i ==0){
                max = input;
            }

            // We check to see if the value of input is greater
            // that our recorded maximum value. If it is then
            // we must update our maximum value to be the input
            if(input > max){
                max = input;
            }
        }
        System.out.println(max);
    }
}
