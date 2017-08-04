package org.launchcode.java.studios;

import java.util.Scanner;

public class area_do_while {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("I will calculate the area of a circle.");
        Double radius = -1.0;
        do {
            System.out.print("What is the radius of the circle? (please ensure it is greater than zero)");
            radius = in.nextDouble();
        } while (radius < 0);
        Double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is " + area);
    }
}
