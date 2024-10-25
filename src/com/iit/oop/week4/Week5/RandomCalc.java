package com.iit.oop.week4.Week5;

import java.util.Scanner;

public class RandomCalc {
    public static void  main(String[] args){
        Scanner scanner  =  new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();



        System.out.println("Enter the operation: ");
        String operation = scanner.next();


        try {
            if (operation.equals("/") && num2 == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
            System.exit(0);
        }catch(Exception exception){
            System.out.println("An unknown error occurred");
        }


        switch(operation){
            case "+":
                System.out.println("The sum is: "+(num1+num2));
                break;
            case "-":
                System.out.println("The difference is: "+(num1-num2));
                break;
            case "*":
                System.out.println("The product is: "+(num1*num2));
                break;
            case "/":
                System.out.println("The division is: "+(num1/num2));
                break;
            default:
                System.out.println("Invalid operation");
        }

    }
}
