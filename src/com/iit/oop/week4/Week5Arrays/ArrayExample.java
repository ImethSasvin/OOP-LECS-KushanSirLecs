package com.iit.oop.week4.Week5Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int []  scoresInt =  new int[5];

        for (int i = 0 ; i < scoresInt.length; i++){
            System.out.println("Enter the score "+(i+1)+" : ");
            scoresInt[i] = scanner.nextInt();
        }

        double [] scoresDouble =  new double[5];

//        scoresInt[0] = 5;
//        scoresInt[1] = 10;
//        scoresInt[2] =

        int [] nums = {2,3,4,5,6};

        System.out.println(Arrays.toString(scoresInt));
        System.out.println(Arrays.toString(scoresDouble));
        System.out.println(Arrays.toString(nums));

//        try{
//            for (int j =0 ; j<scoresDouble.length; j++)
//                System.out.print(scoresInt[j]+" ");
//        }catch(ArrayIndexOutOfBoundsException exception){
//            System.out.println("Array index out of bounds");
//
//        }
    }

    public static void printArray(int [] scoresDouble){
        try{
            for (int j =0 ; j<scoresDouble.length; j++)
                System.out.print(scoresDouble[j]+" ");
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Array index out of bounds");

        }
    }
}
