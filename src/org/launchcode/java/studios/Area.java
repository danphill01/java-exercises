package studios;

import java.util.Scanner;

public class Area {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("I will calculate the area of a circle.");
        System.out.print("What is the radius of the circle? ");
        Double radius = in.nextDouble();
        while (radius < 0) {
            System.out.print("Please enter a radius greater than zero? ");
            radius = in.nextDouble();
        }
        Double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is " + area);
    }
}
