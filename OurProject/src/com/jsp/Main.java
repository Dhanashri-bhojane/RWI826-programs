package com.jsp;

public class Main {

	public static void main(String[] args) {
		//static method :class itself
		sayHi();
		
		//non staticmethod:instance of class
		Main m = new Main();
		m.sayPancake();

	}
	
	static void sayHi () {
		System.out.println("hi ");
	}
	
	 void sayPancake() {
		System.out.println("pancake ");
	}

}
