package com.simplylearn_Calculator_new;

import java.util.Scanner;

public class ArithematicCalculator {

	public static void main(String[] args) {
		
		// Object created for calling all the method
		ArithematicCalculator calc = new ArithematicCalculator();
		
		// Scanner Object are created to take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st for Arithmatic Calculation number");

		double v1 = sc.nextDouble();
		System.out.println("Enter 1st for Arithmatic Calculation number");

		double v2 = sc.nextDouble();
		System.out.println("The Arithmatic Calculation are :: ");
		System.out.println("=======================");

		double numberAddition = calc.addition(v1, v2);
		double numberSubtraction = calc.Substraction(v1, v2);
		double numberMultiplication = calc.Multiplication(v1, v2);
		double numberDivision = calc.Divition(v1, v2);

		System.out.println("Reasult of Addition ::" + numberAddition);
		System.out.println("Reasult of Subtraction ::" + numberSubtraction);
		System.out.println("Reasult of Multiplication ::" + numberMultiplication);
		System.out.println("Reasult of Division ::" + numberDivision);
	}

	// First Arithmetic Operation - Addition
	public double addition(double num1, double num2) {
		return (num1 + num2);
	}

	// First Arithmetic Operation - Subtraction
	public double Substraction(double num1, double num2) {
		return (num1 - num2);

	}

	// First Arithmetic Operation - Multiplication
	public double Multiplication(double num1, double num2) {
		return (num1 * num2);

	}

	// First Arithmetic Operation - Division
	public double Divition(double num1, double num2) {
		return (num1 / num2);

	}
	
}
