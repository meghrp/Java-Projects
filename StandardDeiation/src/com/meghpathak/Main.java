package com.meghpathak;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        double setNumbers [] = {1, 2, 3, 4};
        double addition = 0;
        double addition2 = 0;
        double mean;
        double subtraction [] = new double [setNumbers.length];
        double square [] = new double [setNumbers.length];
        double stdDev ;

        System.out.println("Finding the Standard Deviation of the set;");
        System.out.println(" \t 1, 2, 3, 4 \n");
        System.out.println("Firstly, the mean of this set; \n");

        //The mean of the set;
        for (int i = 0;i < setNumbers.length; i++) {
            addition += setNumbers [i];
        }
        mean = addition / setNumbers.length;
        System.out.println(mean + "\n");

        System.out.println("The next step is to subtract the values from the mean; \n");

        //Subtract mean from values
        for (int i = 0; i < setNumbers.length; i++) {
            subtraction [i]= setNumbers [i] - mean;
            System.out.println(subtraction[i]);
        }

        System.out.println("\nThe next step is to square the difference\n");

        //Square the difference
        for (int i = 0; i < setNumbers.length; i++) {
            square [i] = Math.pow(subtraction[i], 2);
            System.out.println(square [i]);
        }

        System.out.println("\nThe next step is to find the mean of the squared numbers;\n");

        //Mean of the squared numbers
        for (int i = 0;i < setNumbers.length; i++) {
            addition2 += square [i];
        }
        mean = addition2 / square.length;
        System.out.println(mean);

        System.out.println("\nThe final step is to find the Square Root of the Mean of the squared numbers\n\n");

        //Square root of the mean of the squared numbers
        stdDev = Math.sqrt(mean);
        System.out.println("The Standard Deviation of the Set is;");
        System.out.printf("%2.2f", stdDev);

        input.close();

    }
}
