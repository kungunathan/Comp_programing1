package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Declare an array
        int [] myArray;
        myArray = new int [5];
        //Or
        //double [] salary = new double [5];
        //Initialise the array
        System.out.println("Type 5 integers:");
        Scanner input = new Scanner (System.in);
        //Capture values
        for(int i=0; i<myArray.length; i++)
        {myArray [i] = input.nextInt();}
        //Output array element at index 0
        System.out.println(myArray[1]);
        //Display all elements in the array
        for (int n : myArray)
        {System.out.print (n +",");}
    }
}