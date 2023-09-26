package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Create object of class Scanner(system.in)
        Scanner input = new Scanner (System.in);
        //Prompt for input
        System.out.println("What did you score in CSC11 CAT?");
        //Declare and initialize your marks
        double mark = input.nextDouble();
        //if else statement
        if(mark>=0.0 && mark>=50 && mark<=100.0)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
    }
}