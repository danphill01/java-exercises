package org.launchcode.java.demos.java4python;

import java.util.Scanner;

/**
 * From "Java for Python Programmers"
 */
public class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = in.nextLine();
        System.out.println("Hello, ".concat(name));
    }
}
