package com.jsp;

class Bird{
	public void sing() {
		System.out.println("tweet tweet tweet");
	}
}

class Robin extends Bird{
	public void sing() {
		System.out.println("twiddledeedeee");
	}
	
	
}

class pelican extends Bird{
	
}

public class Polymorphism {

	public static void main(String[] args) {
		Robin b = new Robin();
		b.sing();
	}

}
