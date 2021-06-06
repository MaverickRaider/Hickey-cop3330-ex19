
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Hickey
 */

package oop.example;
import java.util.Scanner;
import java.lang.Math;

public class Ex19 {
    public static void main(String[] args) {
        double height, weight, bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight (pounds): ");
        weight = scanner.nextDouble();
        System.out.println("Please enter your height (inches): ");
        height = scanner.nextDouble();

        bmi = (weight / (height * height)) * 703;
        double roundedBMI = Math.round(bmi * 100.0) / 100.0;
        System.out.println("Your BMI is " + roundedBMI);

        if( bmi <= 25 && bmi >= 18.5 ){
            System.out.println("You are within the ideal weight range.");
        }
        else if( bmi > 25 ){
            System.out.println("You are overweight. You should see your doctor.");
        }
        else if( bmi < 18.5 ){
            System.out.println("You are underweight. You should see your doctor.");
        }
        else{
            System.out.println("Error: Invalid Input.");
        }
    }
}