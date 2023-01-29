package com.FSD.OnlineClass2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Welcome to Calculator Program");
		Calculator calc = new Calculator();
		calc.addition();
		calc.substraction();
		calc.Multiplication();
		calc.Division();

	}

	public void addition() {

		System.out.println("You choose addtion Now Please enter values");
		Scanner sc = new Scanner(System.in);
		int intValue1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int intvalue2 = sc.nextInt();
		System.out.println("Addition of those two numbers are ::" + (intValue1 + intvalue2));

	}

	public void substraction() {

		System.out.println("You choose Substrcation Now Please enter values");
		Scanner sc = new Scanner(System.in);
		int intValue1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int intvalue2 = sc.nextInt();
		System.out.println("Substrcation of those two numbers are ::" + (intValue1 - intvalue2));

	}

	public void Multiplication() {

		System.out.println("You choose Multiplication Now Please enter values");
		Scanner sc = new Scanner(System.in);
		int intValue1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int intvalue2 = sc.nextInt();
		System.out.println("Multiplication of those two numbers are ::" + (intValue1 * intvalue2));

	}

	public void Division() {

		System.out.println("You choose Multiplication Now Please enter values");
		Scanner sc = new Scanner(System.in);
		int intValue1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int intvalue2 = sc.nextInt();
		System.out.println("Multiplication of those two numbers are ::" + (intValue1 / intvalue2));

	}
}