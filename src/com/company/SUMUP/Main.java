package com.company.SUMUP;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Please, enter matrix size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        System.out.println("How you want to rotate matrix:" + System.lineSeparator() +
                "\t1 - 90" + System.lineSeparator() +
                "\t2 - 180" + System.lineSeparator() +
                "\t3 - 270");

        int rotateOption = scanner.nextInt();
        double[][] matrix = generateMatrix(size);

        System.out.println(System.lineSeparator() + "Base matrix:" + System.lineSeparator());
        printMatrixToConsole(matrix);
        System.out.println();

        switch (rotateOption){
            case 1:{
                rotate90(matrix);
                break;
            }
            case 2:{
                rotate180(matrix);
                break;
            }
            case 3:{
                rotate270(matrix);
                break;
            }
        }

    }

    public static void rotate90(double[][] matrix) {
            for (int j = 0; j < matrix.length; j++) {
                for (int i = matrix.length - 1; i >= 0 ; i--) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.print("\n");
            }
        }
    public static void rotate180(double[][] matrix) {
        for (int i = matrix.length - 1 ; i >= 0; i--) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void rotate270(double[][] matrix) {
        for (int j = matrix.length - 1; j >= 0 ; j--) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static double[][] generateMatrix(int size) {
        double[][] matrix = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = Double.valueOf(i + j / 10.0);
            }
        }
        return matrix;
    }

    public static void printMatrixToConsole(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}





