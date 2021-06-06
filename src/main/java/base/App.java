/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jamar Jackson
 */

package base;

import java.util.Scanner;

/*
Exercise 7 - Area of a Rectangular Room

        When working in a global environment, you’ll have to present information in both metric and Imperial units. And you’ll need to know when to do the conversion to ensure the most accurate results.

        Create a program that calculates the area of a room. Prompt the user for the length and width of the room in feet. Then display the area in both square feet and square meters.
        Example Output

        What is the length of the room in feet? 15
        What is the width of the room in feet? 20
        You entered dimensions of 15 feet by 20 feet.
        The area is
        300 square feet
        27.871 square meters

        The formula for this conversion is m2 = f2 × 0.09290304
        Constraints

        Keep the calculations separate from the output.
        Use a constant to hold the conversion factor.

        Challenges

        Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
        Create a new version of the program that allows you to choose feet or meters for your inputs.
        Implement this program as a GUI program that automatically updates the values when any value changes.
*/
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        int length = myApp.readLength();
        int width = myApp.readWidth();
        int f2 = myApp.squareFeet(length, width);
        final double m2 = f2 * 0.09290304;
        String outputString = myApp.generateOutputString(length, width, f2, m2);
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public int readLength() {
        System.out.println("What is the length of the room in feet? ");
        return in.nextInt();
    }

    public int readWidth() {
        System.out.println("What is the width of the room in feet? ");
        return in.nextInt();
    }

    public int squareFeet(int length, int width) {
        return length * width;
    }

    public String generateOutputString(int length, int width, int f2, double m2) {
        return "You entered dimensions of " + length + " feet by " + width + " feet.\n" +
                "The area is\n" +
                f2 + " square feet\n" +
                m2 + " square meters";
    }
}
