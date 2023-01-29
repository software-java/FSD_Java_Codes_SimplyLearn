package com.FSD.OnlineClass2;

import java.util.Scanner;

public class Function {
	public static void main(String[] args) {
		int intValue1 = 10;
		int intValue2 = 10;
		System.out.println("The value of two integer ::" + (intValue1 + intValue2));
		Function fn = new Function();
		System.out.println("Checking the value is == or not");
		fn.checkEqualOrNot();
		fn.multiplication();
		System.out.println("Calling the method");
		System.out.println("Hi");
	}

	public void multiplication() {
		System.out.println("Multply mtd. called");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number ::");
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		System.out.println("The Multiplication is ::" +(input1*input2));
		
	}
	
	private void checkEqualOrNot() {
		System.out.println("checking the value of two fn");
		String value1 = "Abhishek";
		String value2 = "Abhishek";
		System.out.println("The value are equal ::" 
				+ (value1 == value2));
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
