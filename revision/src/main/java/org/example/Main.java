package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Variable declaration
        int quiz1,quiz2,quiz3,mid,finl,qtotal,gtotal;
        try (//Scanner initialization
             Scanner marks = new Scanner(System.in)) {
            //Input marks
            System.out.println("Please enter your marks for quiz one");
            quiz1 = marks.nextInt();
            System.out.println("Please enter your marks for quiz two");
            quiz2 = marks.nextInt();
            System.out.println("Please enter your marks for quiz three");
            quiz3 = marks.nextInt();
            System.out.println("Please enter your marks for midterm");
            mid = marks.nextInt();
            System.out.println("Please enter your marks for final exam");
            finl = marks.nextInt();
        }
        //Calculations
        qtotal = quiz1+quiz2+quiz3;
        gtotal = qtotal+mid+finl;
        //Output
        System.out.println("Quiz total:" +qtotal);
        System.out.println("Midterm:" +mid);
        System.out.println("Final:" +finl);
        System.out.println("Total:" +gtotal);
    }
}