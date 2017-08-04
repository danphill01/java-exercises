package exercises;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("I will calculate the area of a rectangle.");
        System.out.print("What is the first dimension (Height)? ");
        Double height = in.nextDouble();
        System.out.print("What is the second dimension (Width)? ");
        Double width = in.nextDouble();
        Double area = height * width;
        System.out.println("The area of the rectangle is " + area);
    }
}
