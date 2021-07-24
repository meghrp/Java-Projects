package com.meghpathak;

public class Main {

    public static void main(String[] args) {

        int firstArray[][] = { {1, 2, 3} , {5, 6, 7} , {7, 8, 9} };
        int secondArray[][] = { {75, 41, 25} , {4, 5, 6} , {1, 3, 9} };

        System.out.println("This is the first array");
        display(firstArray);

        System.out.println("This is the second array");
        display(secondArray);

        int result [][] = new int[firstArray.length][secondArray[0].length];

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray[0].length; j++) {
                for (int k = 0; k < firstArray[0].length; k++) {
                    result[i][j] += firstArray[i][k] * secondArray[k][j];
                }
            }
        }

        System.out.println("\nThe Product of the 2 arrays respectively is; ");
        display(result);

    }

    public static void display (int x[][]) {
        for (int row = 0; row < x.length; row++) {
            System.out.println("\t");
            for (int column = 0; column < x[row].length; column++) {
                System.out.print ("\t" + x[row][column] + "\t");
                }
            }
            System.out.println();
        }
    }
