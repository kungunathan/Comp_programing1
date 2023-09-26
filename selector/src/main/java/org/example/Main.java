package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
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
        //Confirm if number is between 0 and 100
        else if(mark>100|| mark<1)
        {
            System.out.println("The value should be between 0 and 100");
        }
        else
        {
            System.out.println("Failed");
        }
        //Ternary operator
        String result;
        result = (mark >= 50 && mark<=100)? "Passed": (mark>=0 && mark<50)?"failed":"Wrong input";
        System.out.println(result);
        System.out.println("=======Ternary II ======");
        //Determine the greatest number of the two
        System.out.println("");
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("The max of the two is " + ((a>b)? a:b));
    }
}