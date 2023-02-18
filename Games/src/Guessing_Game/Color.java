package Guessing_Game;
// Java Program to Print Colored Text in Console

// Importing input output classes
import java.io.*;

// Main class
public class Color {

    // Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_RESET = "\u001B[0m";

    // Declaring the color
    // Custom declaration
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String CYAN_BACKGROUND = "\u001B[46m";

    // Main driver method
//    public static void main(String[] args)
//    {
//        // Printing the text on console prior adding
//        // the desired color
//        System.out.println(CYAN_BACKGROUND+ANSI_PURPLE
//                + "This text is yellow"
//                + ANSI_RESET);
//    }
}