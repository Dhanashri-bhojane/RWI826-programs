package com.jsp;

public class Class1 {
   String name;
   int age;
   int heightInInches;
   String eyeColor;
   
   public Class1() {
	   
   }
    
   public void speak() {
	   System.out.println("Hello, my name is "+ name);
	   System.out.println(" I am "+ heightInInches +"inches tall");
	   System.out.println("I am"+ age +"years old");
	   System.out.println("My eye color is "+eyeColor);
	   
	    }
   
   public void eat() {
	   System.out.println("eating...");
   }
   
   public void walk() {
	   System.out.println("walking...");
   }
   
   public void work() {
	   System.out.println("working...");
   }
   
}
