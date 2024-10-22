package com.edu.chmnu.ki_123.c3;

public class Main {

    public static double min = 0;
    public static double max = 0;


    public static void findMinimumMaximum(double[][] matrix, int index) {

        for(int i = 0; i < matrix.length; ++i) {
            if (i == 0) {
                min = matrix[i][index];
                max = matrix[i][index];
            } else {
                if (matrix[i][index] > max) {
                    max = matrix[i][index];
                }
                if (matrix[i][index] < min) {
                    min = matrix[i][index];
                }
            }
        }
    }

    public static void main(String[] args){

        double[][] matrix =
                {{3.4, 3.2, 2.5},
                {3.6, 7.3, 3.7},
                {2.5, 7.8, 6.7}};

        int index = 1;

        findMinimumMaximum(matrix, index);

        System.out.println("Min value is " + min);
        System.out.println("Max value is " + max);
    }
}