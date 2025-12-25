package com.day1;

import java.util.Scanner;

public class Q2MinValue {
    public static int minVal(int arr[], int size){
        int smallest = arr[0];
        for(int i=1; i<size; i++){
            if(smallest>arr[i]){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements of the array: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();;
        int min = minVal(arr, size);
        System.out.println("Minimum Value from the array: " + min);
    }
}
