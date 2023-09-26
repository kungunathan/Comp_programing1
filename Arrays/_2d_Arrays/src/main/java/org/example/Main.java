package org.example;
public class Main {
    public static void main(String[] args) {
        // Declaring a 2D array
        int [][] matrix = new int [3][2];
        //initialize the array
        matrix [0][0] =2;
        matrix [0][1] =3;
        matrix [1][0] =4;
        matrix [1][1] =5;
        matrix [2][0] =6;
        matrix [2][1] =7;

        //Display element of the array using loop
        for (int row=0; row<matrix[row].length; row++)
        {
            for (int col=0; col<matrix[col].length; col++)
            {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }
}