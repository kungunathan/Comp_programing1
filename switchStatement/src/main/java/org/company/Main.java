package org.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //declare variables
        int num1, num2, num3, least, max;
        //prompt user for 3 integers
        System.out.println("Type 3 integers values");
        Scanner input = new Scanner (System.in);
        System.out.print("1st number: ");
        num1= input.nextInt();
        System.out.print("2nd number: ");
        num2 = input.nextInt();
        System.out.print("3rd number: ");
        num3 = input.nextInt();
        //display menu
        System.out.println("\t Code \t Function");
        System.out.println ("\tA \t\t Least");
        System.out.println ("\tB \t\t greatest");
        System.out.println ("\tC \t\t sum");
        //declare selector
        char choice;
        //prompt user to choose function from menu
        System.out.println("What function do you want to apply on your integers? Type the function code 1,2 or3");
        choice = input.next().charAt(0);
        System.out.println("=======Switch Statement =========");
        switch (choice)
        {
            case 'A':
                System.out.println ("You choose Least function");
                least = (num1<num2 && num1<num3 )? num1 : (num2<num1 && num2<num3) ? num2: num3;
                System.out.println("The least of the 3 = "+ least);
                break;
            case 'B':

                if (num1>num2 && num1>num3)
                    max = num1;
                else if (num2>num1 && num2>num3)
                    max =num2;
                else if (num3>num1 && num3>num2)
                    max=num3;
                else
                    System.out.println ("All the 3 values are equal");
                break;
            case 'C':
                System.out.println ("You choose function sum and the value is " +(num1+num2+num3));
                break;
            default:
                System.out.println("Your choice is not either 1, 2 or 3!!!");
        }
    }
}