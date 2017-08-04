package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("I will calculate the MPG for your trip.");
        System.out.print("How many miles did you drive? ");
        Double miles = in.nextDouble();
        System.out.print("How many gallons did you use? ");
        Double gallons = in.nextDouble();
        Double mpg = miles / gallons;
        System.out.println("The MPG for the trip was " + mpg);
    }
}
