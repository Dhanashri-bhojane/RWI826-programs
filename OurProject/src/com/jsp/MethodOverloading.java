package com.jsp;

public class MethodOverloading {

	public static void main(String[] args) {
		int result1 = addNumbers(3,2);
		double result2 = addNumbers(3.1,2.7);

		 
		System.out.println(result1);
		System.out.println(result2);
		
	}
	
	public static int addNumbers(int a, int b) {
		return a+b;
	}
	
	public static double addNumbers(double a, double b) {
		return a+b;
	}

}
