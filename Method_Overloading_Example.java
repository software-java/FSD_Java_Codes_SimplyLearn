package com.FSD.OnlineClass2;

public class Method_Overloading_Example {
	public static void main(String[] args) {
		Method_Overloading_Example example = new Method_Overloading_Example();
		int a = example.addition(10, 10);
		int b = example.addition(10, 10, 10);
		int c = example.multiplication(10, 2);
		int d = example.multiplication(10, 10, 10);
		System.out.println("Addition of two num ::" + a);
		System.out.println("Addition of three num ::" + b);
		System.out.println("Multiplication of two num ::" + c);
		System.out.println("Multiplication of three num ::" + d);
	}

	public int addition(int a, int b) {
		System.out.println("Addition of two variables");
		return (a + b);
	}

	public int addition(int a, int b, int c) {
		System.out.println("Three variable addition funtion");
		return (a + b + c);
	}

	public int multiplication(int a, int b) {
		System.out.println("2 digit multiplication function");
		return a * b;
	}

	public int multiplication(int a, int b, int c) {
		System.out.println("2 digit multiplication function");
		return a * b * c;
	}
}
