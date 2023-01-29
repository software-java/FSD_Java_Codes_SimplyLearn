package com.FSD.OnlineClass2;

import java.util.Scanner;

public class Calculator_with_Switch_Key {

	public static void main(String[] args) {
			
		Calculator_with_Switch_Key calc = new Calculator_with_Switch_Key();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose 1 for + 2 for - 3 for multi and 4 for divition");
		int num = sc.nextInt();
		
//		int num ;

	    switch (num) {

	      case 1:

	        calc.addition();

	        break;

	      case 2:

	        calc.substraction();

	        break;

	      case 3:

	        calc.Multiplication();

	        break;

	      case 4:

	        calc.Division();
	        break;
	}
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

			System.out.println("You choose Division Now Please enter values");
			Scanner sc = new Scanner(System.in);
			int intValue1 = sc.nextInt();
			System.out.println("Enter Second Number");
			int intvalue2 = sc.nextInt();
			System.out.println("Division of those two numbers are ::" + (intValue1 / intvalue2));

		}
	    
	    
	    
	    
}