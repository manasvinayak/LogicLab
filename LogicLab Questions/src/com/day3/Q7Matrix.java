package com.day3;

import java.util.Scanner;

public class Q7Matrix {
    static Scanner sc = new Scanner(System.in);
    
    public static void printMatrix(int[][] matrix) {
    	System.out.println("Resulted Matrix:");
        for(int row[]: matrix) {
            for(int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] readMat(int r, int c) {
        int[][] matrix = new int[r][c];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
    
    public static int[][] add(int r, int c, int[][] A, int[][] B) {
        int[][] res = new int[r][c];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                res[i][j] = A[i][j] + B[i][j];
            }
        }
        return res;
    }
    
    public static int[][] subtract(int r, int c, int[][] A, int[][] B) {
        int[][] res = new int[r][c];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                res[i][j] = A[i][j] - B[i][j];
            }
        }
        return res;
    }
    
    public static int[][] multiply(int r, int c, int k, int[][] A, int[][] C) {
        int[][] res = new int[r][k];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < k; j++) {
                for(int m = 0; m < c; m++) {
                    res[i][j] += A[i][m] * C[m][j];
                }
            }
        }
        return res;
    }
    
    public static int[][] transpose(int r, int c, int[][] A) {
        int[][] res = new int[c][r]; 
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                res[j][i] = A[i][j];
            }
        }
        return res;
    }
    
    public static void printSums(int r, int c, int[][] A) {
        for(int i = 0; i < r; i++) {
            int rowSum = 0;
            for(int j = 0; j < c; j++) {
                rowSum += A[i][j];
            }
            System.out.println("Row " + i + " sum: " + rowSum);
        }
        for(int j = 0; j < c; j++) {
            int colSum = 0;
            for(int i = 0; i < r; i++) {
                colSum += A[i][j];
            }
            System.out.println("Col " + j + " sum: " + colSum);
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Enter rows and columns (2-10): ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter Matrix A:");
        int[][] matrixA = readMat(r, c);
        System.out.println("Enter Matrix B:");
        int[][] matrixB = readMat(r, c);
        while(true) {
            System.out.println("\n--- Matrix Menu ---");
            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Transpose\n5. Row/Col Sums\n6. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            if(choice == 6) {
            	System.out.println("Bye Bye!!");
            	break;
            }
            switch(choice) {
                case 1:
                    printMatrix(add(r, c, matrixA, matrixB));
                    break;
                case 2:
                    printMatrix(subtract(r, c, matrixA, matrixB));
                    break;
                case 3:
                    System.out.print("Enter columns for second matrix (k): ");
                    int k = sc.nextInt();
                    System.out.println("Enter a " + c + "x" + k + " Matrix C:");
                    int[][] matrixC = readMat(c, k);
                   	if(r!=k) {
                		System.out.println("Rows of 1st Matrix should be equal to the columns of 2nd Matrix.");
                	}
                   	else {
                   		printMatrix(multiply(r, c, k, matrixA, matrixC));
                	}
                    break;
                case 4:
                    printMatrix(transpose(r, c, matrixA));
                    break;
                case 5:
                    printSums(r, c, matrixA);
                    break;
                default:
                    System.out.println("Invalid Choice. Please try again.");
                    continue;
            }
        }
    }
}
